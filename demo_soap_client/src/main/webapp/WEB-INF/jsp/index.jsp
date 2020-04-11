<%@ page import="com.example.demo.ws.Currency" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp"></jsp:include>


<table>
    <thead>
    <tr>
        <th>CODE</th>
        <th>IMAGE</th>
        <th>PRODUCT NAME</th>
        <th>DESCRIPTION</th>
        <th>STOCK</th>
        <th>PRICE</th>
        <th>CURRENCY</th>
        <th>ACTION</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${products}" var="product">
        <tr>
            <td><input id="code" type="text" readonly value="${product.code}"/></td>
            <td><img src="${product.base64Image}"></td>
            <td><input id="name" type="text" value="${product.name}"/></td>
            <td><textarea cols="30">${product.description}</textarea></td>
            <td><input id="stock" type="text" value="${product.stock}"/></td>
            <td><input id="price" type="text" value="${product.price}"/></td>
            <td>
                <select id=currency>
                    <c:forEach items="${Currency.values()}" var="currency">
                        <option value="${currency}" ${currency == product.currency ? "selected" : ""}>
                                ${currency}
                        </option>
                    </c:forEach>
                </select>
            <td>
                <input class="js-update-product" type="submit" value="&#9989"/>
                <input class="js-remove-product" type="submit" value="&#10060"/>
            </td>
        </tr>
    </c:forEach>

    </tbody>
</table>


<jsp:include page="footer.jsp"></jsp:include>
