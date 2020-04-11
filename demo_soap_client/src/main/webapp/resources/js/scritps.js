$('.js-update-product').on('click', function (e) {
    $element = e.target;
    $tr = $($element.closest('tr'));

    const code = $tr.find('input[id=code]').val();
    const name = $tr.find('input[id=name]').val();
    const description = $tr.find('input[id=description]').val();
    const stock = $tr.find('input[id=stock]').val();
    const price = $tr.find('input[id=price]').val();
    const currency = $tr.find('select[id=currency]').val();

    const product = {
        code: code,
        name: name,
        description: description,
        stock: stock,
        price: price,
        currency: currency
    };

    $.ajax({
        url: "/update",
        type: 'POST',
        data: JSON.stringify(product),
        contentType: 'application/json',
        mimeType: 'application/json',
        success: function (status) {
            alert(status == true ? "Product updated successfully." : "Something went wrong. Please contact us.")
        }
    });
});

$('.js-remove-product').on('click', function (e) {
    $element = e.target;
    $tr = $($element.closest('tr'));

    const code = $tr.find('input[id=code]').val();
    const product = {
        code: code
    };

    $.ajax({
        url: "/remove",
        type: 'POST',
        data: JSON.stringify(product),
        contentType: 'application/json',
        mimeType: 'application/json',
        success: function (status) {
            if (status == true) {
                $tr.remove();
            }
            alert(status == true ? "Product removed successfully." : "Something went wrong. Please contact us.")
        }
    });
});
