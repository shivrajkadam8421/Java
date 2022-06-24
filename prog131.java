

import PackageX.LogicString.StringReverseX;

class prog131
{
    public static void main(String arg[])
    {
        StringReverseX obj =new StringReverseX();
         obj.Accept();
         obj.Display();
        String str=obj.ReverseX();
        System.out.println("Reverse String : "+str);
    }
}