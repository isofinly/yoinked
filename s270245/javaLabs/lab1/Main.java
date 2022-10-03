import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        int nCount = (20 - 4) / 2 + 1;
        int xCount = 18;

        long[] g = new long[nCount];
        float[] x = new float[xCount];

        {
            int i = 0;
            for (int n = 4; n <= 20; n += 2) {
                g[i] = n;
                i++;
            }
        }

        {
            Random random = new Random();
            float min = -2;
            float max = 12;
            for (int i = 0; i < x.length; i++) {
                x[i] = min + random.nextFloat() * (max - min);
            }
        }

        float[][] d = new float[9][18];

        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 18; j++)
            {
                switch ((int) g[i])
                {
                    case 16:
                        d[i][j] = Function1(x[j]);
                        break;
                    case  6:
                    case 10:
                    case 18:
                    case 20:
                        d[i][j] = Function2(x[j]);
                        break;
                    default:
                        d[i][j] = Function3(x[j]);
                        break;
                }

                System.out.print(String.format("%9.5f", d[i][j]));
            }
            System.out.println();
        }
    }

    public static float Function1(float x)
    {
        double value = (x + 5) / 14;
        value = Math.asin(value);
        value = Math.PI + value;
        value = value / 3 / 4;
        value = Math.pow(value, 3);
        return (float) value;
    }

    public static float Function2(float x)
    {
        double value = 1f / 3 + Math.sin(x);
        value = 0.25f / value;
        double value2 = Math.pow(Math.sin(x), 2);
        value2 = Math.log(value2);
        // System.out.println(String.format("% .3f  in the power of % .3f", value2, value));
        // Negative number in a float power (=root of), thus is NaN.
        value = Math.pow(value2, value);
        return (float) value;
    }

    public static float Function3(float x)
    {
        double value = 2 * x * x;
        value = Math.pow(value, 3) / 2;
        double value2 = 1 / Math.pow(Math.E, Math.abs(x));
        value2 = Math.asin(value2);
        value = Math.pow(value, value2);
        value = Math.cos(value);
        return (float) value;
    }
}
