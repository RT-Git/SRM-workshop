<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">



		<div class="body">
		
   <p> The users are: </p>
   <table>
   <c:forEach items="${nameFromController}" var="User">
       <script language="javascript">
           var e=document.getElementById("cus_id");
           e.textContent = ${User.cus_id};
           var c=document.getElementById("cus_name");
           c.textContent=${User.cus_name};
           var d=document.getElementById("cus_amount");
           d.textContent=${User.cus_amount};
       </script>
   <tr><form action="ControllerForAdd">
       <td><input id="cus_id"  name="customer_id">${User.cus_id}</td>
       
       <td><input id="cus_name" name="username">${User.cus_name}</td>
       
       <td><input id="cus_amount" name="user_amount">${User.cus_amount}</td>
       
        <td><input type="text" name="amountToBeAdded"/> </td>
             
        <td> <input type="radio" name="radioButton" value="add">Credit</td>
        
        <td> <input type="radio" name="radioButton" value="subtract">Debit</td>
        <td> <input type="submit" value="Submit" /></td>
        
       </form>
    </tr>
</c:forEach>
   
   </table>
		</div>

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

	</tiles:putAttribute>
</tiles:insertDefinition>
