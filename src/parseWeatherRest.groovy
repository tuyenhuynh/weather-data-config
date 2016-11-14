
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.fasterxml.jackson.databind.*
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.*
com.fasterxml.jackson.databind.JsonNode;

def nodes = rest.getJsonNode "nodes"

for (JsonNode node : nodes) {
    def response = node.get("response")
    println response
}
