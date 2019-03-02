<%@page import="com.jpn.entity.EmpEntity"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../menu.jsp" %>
<%
	ArrayList<EmpEntity> list=(ArrayList<EmpEntity>) request.getAttribute("emp");
	if(list != null)
	{	
%>
		<table border="1" align="center" width="500">
			<tr>
				<td>사원번호</td>
				<td>사원이름</td>
				<td>연락처</td>
				<td>부서</td>
				<td>수정</td>
				<td>삭제</td>
			</tr>
<%

	for(EmpEntity ob: list)
	{
%>
			<tr>
				<td><%=ob.getEno()%></td>
				<td><%=ob.getEname()%></td>
				<td><%=ob.getPhone()%></td>
				<td><%=ob.getDept() %></td>
				<td>
              	 <form action="/log/emptest/empUpdate.jsp" method="post">
                 	 <input type="hidden" name="eno" value="<%=ob.getEno()%>"> <!-- 라이프사이클 중 page. 새 페이지에서는 정보가 없응니까 페이지에는 안보이게하면서 정보불러오는것 -hidden -->
                  	 <input type="hidden" name="ename" value="<%=ob.getEname()%>">
                  	 <input type="hidden" name="phone" value="<%=ob.getPhone()%>">
                 	 <input type="hidden" name="dept" value="<%=ob.getDept()%>">
                 	 <input type="submit" value="수정">                           
               	</form>
           		</td>
           		 <td>
              		 <form action="/log/delete" method="post">
                 		 <input type="hidden" name="eno" value="<%=ob.getEno()%>">
                  		 <input type="submit" value="삭제" onclick="return confirm('삭제 할까요?')">                                                                                       
              		 </form>
            	</td>
			</tr>	
<%
	}//end of for
%>
				
		</table>
<%
	}//end of if
%>				
</body>
</html>







