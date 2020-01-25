package com.company.LULU;

import com.company.LULU.companyBaseListener;
import javafx.scene.Parent;

import java.util.*;

public class SearchTree {

    public static Node Root;
    public static String FinalData="";
    public SearchTree(companyBaseListener.Symbol_table rt)
    {
        Root = new Node(rt);
        Root.Parent = null;
        Root.Children = new ArrayList<>();
    }

    public boolean Add(companyBaseListener.Symbol_table tobe, companyBaseListener.Symbol_table paren)
    {
        Node before=Search(paren);// --> pre-order returns Node s
        if(before==null) return false;
        Node q = new Node(tobe);
        before.Children.add(q);
        q.Parent = before;
        q.Children = new ArrayList<Node>();
        return true;
    }

    public static void GetSymbolTables(Node top) {
        for (Node child : top.Children) {
            companyBaseListener.Symbol_table s = top.current;
            FinalData += "{ \n";
            if (s.body_type.equals(companyBaseListener.Symbol_name.global)) {
                FinalData += "GLOBAL \n";

                FinalData += "Variable: \n";
                for (var vars : s.Variables) {
                    FinalData += vars.type;
                    FinalData += "   ";
                    FinalData += vars.name;
                    FinalData += "   ";
                    FinalData += vars.value;
                    FinalData += "\n";
                }

                FinalData += "Functions : \n";
                for (var fs : s.functions.keySet()) {

                    FinalData += fs.Access + "  (";
                    for (String type : fs.returns) {
                        FinalData += type + " ,";
                    }
                    FinalData +=  ") = ";
                    FinalData += fs.name;
                    FinalData += "  (";
                    for (String type : fs.para) {
                        FinalData += type + " ,";
                    }
                    FinalData +=  ")";

                    FinalData += "\n";
                }

                FinalData += "User Defined Types : \n";
                for (var c : ((companyBaseListener.Global_Symbol_table) (s)).classes.keySet())
                {
                    FinalData += c.headername ;
                    FinalData += " : ";
                    FinalData += c.inheritclass;
                    FinalData += "\n";
                }
                FinalData += "\n";

            } else if (s.body_type.equals(companyBaseListener.Symbol_name.classs))
            {
                FinalData += "CLASS " + ((companyBaseListener.Global_Symbol_table)(Root.current)).GetClassHeadFromBody(s)+" : " +  "\n \n";

                FinalData += "Variable: \n";
                for (var vars : s.Variables) {
                    FinalData += vars.type;
                    FinalData += "   ";
                    FinalData += vars.name;
                    FinalData += "   ";
                    FinalData += vars.value;
                    FinalData += "\n";
                }

                FinalData += "Functions : \n";
                for (var fs : s.functions.keySet()) {

                    FinalData += fs.Access + "  (";
                    for (String type : fs.returns) {
                        FinalData += type + " ,";
                    }
                    FinalData += ") = ";
                    FinalData += fs.name;
                    FinalData +=  "  (";
                    for (String type : fs.para) {
                        FinalData += type + " ,";
                    }
                    FinalData +=  ")";

                    FinalData += "\n";
                }
                FinalData += "\n";
            }
            else if (s.body_type.equals(companyBaseListener.Symbol_name.function))
            {
                FinalData += "Function :" +  "\n \n";

                FinalData += "Variable: \n";
                for (var vars : s.Variables) {
                    FinalData += vars.type;
                    FinalData += "   ";
                    FinalData += vars.name;
                    FinalData += "   ";
                    FinalData += vars.value;
                    FinalData += "\n";
                }
                FinalData += "\n";
            }
            else if(s.body_type.equals(companyBaseListener.Symbol_name.loop))
            {
                FinalData += "LOOP STATEMENT : \n \n";
                FinalData += "Variables: \n";
                for (var vars : s.Variables) {
                    FinalData += vars.type;
                    FinalData += "   ";
                    FinalData += vars.name;
                    FinalData += "   ";
                    FinalData += vars.value;
                    FinalData += "\n";
                }
                FinalData+="\n";
            }
            else if(s.body_type.equals(companyBaseListener.Symbol_name.ifelse))
            {
                FinalData += "LOOP STATEMENT : \n \n";
                FinalData += "Variables: \n";
                for (var vars : s.Variables) {
                    FinalData += vars.type;
                    FinalData += "   ";
                    FinalData += vars.name;
                    FinalData += "   ";
                    FinalData += vars.value;
                    FinalData += "\n";
                }
                FinalData+="\n";
            }
            GetSymbolTables(child);
            FinalData+= "\n}";
        }

    }

    public Node Search(companyBaseListener.Symbol_table st)
    {
        Queue<Node> queue = new LinkedList<Node>() ;

        if (Root == null)
            return null;
        queue.clear();
        queue.add(Root);
        while(!queue.isEmpty()){
            Node node = queue.remove();
            if(node.current == st) return node;
            for (var n:node.Children) {
                queue.add(n);
            }
        }
        return null;
    }

    public class Node
    {
        Node Parent;
        companyBaseListener.Symbol_table current;
        List<Node> Children ;

        public Node(companyBaseListener.Symbol_table st)
        {
            current =st;
        }
    }
}

