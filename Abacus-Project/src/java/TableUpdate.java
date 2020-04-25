/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Elia
 */
public class TableUpdate extends HttpServlet {



    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
            response.setContentType("text/html");

    String datasent = request.getParameter("dataSent");
    System.out.println(datasent);
    
     //Instantiating the File class
      String filePath = "C:\\Users\\Elia\\Documents\\NetBeansProjects\\Abacus-Project\\web\\cose.html";
      //Instantiating the Scanner class to read the file
      Scanner sc = new Scanner(new File(filePath));
      //instantiating the StringBuffer class
      StringBuffer buffer = new StringBuffer();
      //Reading lines of the file and appending them to StringBuffer
      while (sc.hasNextLine()) {
         buffer.append(sc.nextLine()+System.lineSeparator());
      }
      String fileContents = buffer.toString();
      System.out.println("Contents of the file: "+fileContents);
      //closing the Scanner object
      sc.close();
      String oldLine1 = "<!--Write here-->";
      String newLine1 = "<tr>\n" +
"<td data-th=\"Data\">19/04/2020</td>\n" +
"<td data-th=\"Ora\">06:13:14</td>\n" +
"<td data-th=\"Magnitudo\">2.3</td>\n" +
"<td data-th=\"Zona\">Confine Italia Slovenia (SLOVENIA)</td>\n" +
"<td data-th=\"Profondita\">16</td>\n" +
"</tr>\n";
      
      String oldLine2 = "<!--nuova-->";
      String newLine2 = "<!--Write here-->\n" +
"\n" +
"<!--nuova-->";
      //Replacing the old line with new line
      fileContents = fileContents.replaceAll(oldLine1, newLine1);
      fileContents = fileContents.replaceAll(oldLine2, newLine2);
      //instantiating the FileWriter class
      FileWriter writer = new FileWriter(filePath);
      System.out.println("");
      System.out.println("new data: "+fileContents);
      writer.append(fileContents);
      writer.flush();
      


    response.getWriter().write("I am from server");
    

}}

/* <object data='d1.txt'></object>**/