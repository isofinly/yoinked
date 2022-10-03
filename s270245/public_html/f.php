<!DOCTYPE html>
<html>


<link href="styles.css" rel="stylesheet" type="text/css">


<head>
    <title>Birds are singing, flowers are blooming</title>
</head>


<?php
    $ExecStartTime = microtime(true);

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


<body>

    <?php
        $X;
        $Y;
        $R_array = array();
        $Offset;
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
            
        if (isset($_POST["offset"]) && is_numeric($_POST["offset"]))
            $Offset = floatval($_POST["offset"]);
        else
            $InputCorrect = false;
    ?>

    <div id="tophat">
        ОЛЕГ ОСИПОВ, P3214 <br>
        <span>Вариант 214013</span>
    </div>



    <div id="main">
        
        <div class="formholder">

            <p>
                <?php
                    if ($InputCorrect) 
                    {
                        echo "Let's see... <br>";
                        echo '<table class="resulttable">';
                        echo '<tr class="toprow"> <th>X</th> <th>Y</th> <th>R</th> <th>Did it work?</th> </tr>';
                        foreach ($R_array as $R) 
                        {
                            echo "<tr>";
                            echo "<th> $X </th>";
                            echo "<th> $Y </th>";
                            echo "<th> $R </th>";
                            $result = isPointIn($X, $Y, $R);
                            if ($result)
                                echo '<th class="resultcell"> A hit! </th>';
                            else
                                echo '<th class="resultcell"> nope </th>'; 
                            echo "</tr>";
                        }
                        echo "</table>";
                    } 
                    else 
                    {
                        echo "I'm so sorry, but I cannot work with incorrect values!";
                    }
                ?>

            <p>
                Request time: 
                <?php 
                    if ($InputCorrect)
                        echo date("H:i:s", $ExecStartTime - $Offset * 60);
                    else
                        echo "It's muffin time!";
                ?>
                <br>

                Script executed in
                <?php
                    $ExecEndTime = microtime(true);

                    printf("%3.3f", ($ExecEndTime - $ExecStartTime) * 1000);
                ?>
                milliseconds. Yay!
            </p>

            <form action="https://se.ifmo.ru/~s270245/">
                <button type="submit" id="form_button_submit">Try again!</button>
            </form>
        </div>

        <div class="graphics">
            <img src="img/graph.png" alt="Oh no, where's the thing?">
        </div>
    </div>
</body>

</html>