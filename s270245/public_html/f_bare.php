<?php
    $ExecStartTime = microtime(true);

    $X;
    $Y;
    $R_array = array();
    $InputCorrect = true;

    if (isset($_POST["value_x"]) && is_numeric($_POST["value_x"]))
        $X = floatval($_POST["value_x"]);
    else
        $InputCorrect = false;

    if (isset($_POST["value_y"]))
    {
        $_POST["value_y"] = str_replace(",", ".", $_POST["value_y"]);

        if (is_numeric($_POST["value_y"]))
            $Y = floatval($_POST["value_y"]);
        else
            $InputCorrect = false;
    }
    else
        $InputCorrect = false;

    if (isset($_POST["value_r"]))
        foreach ($_POST["value_r"] as $element_r)
            $R_array[] = $element_r;
    else
        $InputCorrect = false;
?>



<?php
    function isPointIn($p_x, $p_y, $p_r)
    {
        $X = $p_x / $p_r;
        $Y = $p_y / $p_r;


        //Quadrant I
        if ($X >= 0 && $Y >= 0)
        {
            if (pow($X, 2) + pow($Y, 2) <= 1)
                return true;
            else 
                return false;
        }
        
        //Quadrant II
        if ($X < 0 && $Y >= 0)
        {
            if ($X >= -0.5 && $Y <= 1)
                return true;
            else
                return false;
        }
        
        //Quadrant III
        if ($X < 0 && $Y < 0)
        {
            return false;
        }
        
        //Quadrant IV
        if ($X >= 0 && $Y < 0)
        {
            $Y = abs($Y);
            if ($Y <= (0.5 - $X / 2))
                return true;
            else
                return false;
        }
    }
?>



<p>
    <?php
        if ($InputCorrect) 
        {
            echo "Let's see... <br>";
            echo "<table>";
            foreach ($R_array as $R) 
            {
                echo "<tr>";
                echo "<th> $X </th>";
                echo "<th> $Y </th>";
                echo "<th> $R </th>";
                $result = isPointIn($X, $Y, $R);
                if ($result)
                    echo "<th> A hit! </th>";
                else
                    echo "<th> nope </th>"; 
                echo "</tr>";
            }
            echo "</table>";
        } 
        else 
        {
            echo "Cannot work with incorrect values, sorry!";
        }
    ?>
</p>

<p>
    Current time: 
    <?php 
        echo "It's muffin time!" 
    ?>
    <br>

    Script executed in
    <?php
        $ExecEndTime = microtime(true);

        printf("%3.3f", ($ExecEndTime - $ExecStartTime) * 1000);
    ?>
    milliseconds. Yay!
</p>