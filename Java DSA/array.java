public class array
{
    public static void main(String[] args) 
    {
        String name[] = new String[5];
        name[0]="Kiran";
        name[1]="Ram";
        name[2]="Krishna";
        name[3]="Bharat";
        name[4]="Laxman";
        System.out.println(name[1]);
        System.out.println(name.length);

        for(int i=0;i<name.length;i++)
        {
            System.out.println(name[i]);
        }
    }

}
