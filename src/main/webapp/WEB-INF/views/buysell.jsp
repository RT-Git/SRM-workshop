<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body" >
<table>
<form action ="LogActivity.jsp"  method="get">  
 <tr>
  <td style="font-size: 20px;color: white;">Customer Id</td><td>
  <input type="text" name="custid5"></td>
  
<td><input type="submit" value="Submit" style="height: 35px;
    width: 83px;
    background: linear-gradient(to top,#003200,#003200);
    color: white;
    font-weight: 600;"></td>
    
</tr>
</form>
<form action="Details.jsp" method="get">
<tr>
<td style="font-size: 20px;color: white;">Customer Id</td><td>
  <input type="text" name="custid6"></td>
  
<td> 
	<input type="submit" value="Details" style="height: 35px;
    width: 83px;
    background: linear-gradient(to top,#003200,#003200);
    color: white;
    font-weight: 600;"></td>
    	</tr>
    	</form>

<tr>
	    <form action="cash.jsp" method="get">
 
 

      
    <td><input type="submit" value="BUY" style="height: 35px;
    width: 83px;
    background: linear-gradient(to top,#003200,#003200);
    color: white;
    font-weight: 600;"></td>
     

 </form>
    <form action="sell.jsp" method="get">
    <td style="font-size: 20px;color: white;">Customer Id</td><td>
  <input type="text" name="custid3"></td>
          
    <td><input type="submit" value="SELL" style="height: 35px;
    width: 83px;
    background: linear-gradient(to top,#003200,#003200);
    color: white;
    font-weight: 600;"></td>
     </tr>

</form>
  	
    	</table>
    	 </form>
    	<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
	</tiles:putAttribute>
</tiles:insertDefinition>