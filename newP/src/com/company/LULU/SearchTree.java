package com.company.LULU;

import com.company.LULU.companyBaseListener;
import javafx.scene.Parent;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SearchTree {

    public Node Root;

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

