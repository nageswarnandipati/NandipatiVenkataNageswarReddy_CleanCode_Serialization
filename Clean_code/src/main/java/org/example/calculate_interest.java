package org.example;

class calculate_interest
{
    float power(float n,int f)
    {
        float k = 1;
        int i;
        for(i=0;i<f;i++)
        {
            k = k*n;
        }
        return k;
    }
    float simple_interest(float principal_amount,float interest_rate,int time)
    {
        return (principal_amount*time*interest_rate)/100;
    }
    float compound_interest(float principal_amount,float interest_rate,int time,int times)
    {
        return principal_amount*power((1+(interest_rate/times)),times*time);
    }
}

