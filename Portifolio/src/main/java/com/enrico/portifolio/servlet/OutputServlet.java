/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.enrico.portifolio.servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;
import org.json.*;

@WebServlet("/output")
public class OutputServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Criação de uma lista de novidades (você pode pegar isso de um banco de dados)
        JSONArray novidades = new JSONArray();

        // Exemplo de dados de novidades
        JSONObject novidade1 = new JSONObject();
        novidade1.put("titulo", "Novo Projeto!");
        novidade1.put("conteudo", "Acabei de finalizar um novo projeto de site responsivo.");
        novidade1.put("data", "20/11/2024");

        JSONObject novidade2 = new JSONObject();
        novidade2.put("titulo", "Atualização de Curriculum");
        novidade2.put("conteudo", "Atualizei meu currículo com novas habilidades.");
        novidade2.put("data", "18/11/2024");

        novidades.put(novidade1);
        novidades.put(novidade2);

        // Configurar o tipo de conteúdo da resposta
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Enviar a resposta
        PrintWriter out = response.getWriter();
        out.print(novidades.toString());
        out.flush();
    }
}

