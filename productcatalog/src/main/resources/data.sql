INSERT INTO PRODUCTCATALOG_BRAND (NAME) VALUES ('ADIDAS');
INSERT INTO PRODUCTCATALOG_BRAND (NAME) VALUES ('PUMA');
INSERT INTO PRODUCTCATALOG_BRAND (NAME) VALUES ('NIKE');
INSERT INTO PRODUCTCATALOG_BRAND (NAME) VALUES ('ASICS');

  INSERT INTO PRODUCTCATALOG_COLOR(NAME)  VALUES ('RED');
  INSERT INTO PRODUCTCATALOG_COLOR(NAME)  VALUES ('GREEN');
  INSERT INTO PRODUCTCATALOG_COLOR(NAME)  VALUES ('BLUE');

  INSERT INTO PRODUCTCATALOG_PRODUCTCATEGORY(NAME) VALUES ('SHIRT');
  INSERT INTO PRODUCTCATALOG_PRODUCTCATEGORY(NAME) VALUES ('PANT');
  INSERT INTO PRODUCTCATALOG_PRODUCTCATEGORY(NAME) VALUES ('ACCESSORIES');

  INSERT INTO PRODUCTCATALOG_PRODUCT(NAME,QUANTITY,SIZE,PRICE,BRAND_ID,COLOR_ID,PRODUCT_CATEGORY_ID) VALUES
  ('STRIPED TSHIRT',10,'M',2000,1,1,1);
  INSERT INTO PRODUCTCATALOG_PRODUCT(NAME,QUANTITY,SIZE,PRICE,BRAND_ID,COLOR_ID,PRODUCT_CATEGORY_ID) VALUES('BLUE WASHED JEANS',20,'S',3000,2,3,2),
  ('SOCKS',200,'L',300,4,2,3);
  INSERT INTO PRODUCTCATALOG_PRODUCT(NAME,QUANTITY,SIZE,PRICE,BRAND_ID,COLOR_ID,PRODUCT_CATEGORY_ID) VALUES
  ('WINDCHEATER JACKET',200,'S',300,4,2,2);
  INSERT INTO PRODUCTCATALOG_PRODUCT(NAME,QUANTITY,SIZE,PRICE,BRAND_ID,COLOR_ID,PRODUCT_CATEGORY_ID) VALUES
  ('SHIRT',200,'XL',300,4,2,1);
  INSERT INTO PRODUCTCATALOG_PRODUCT(NAME,QUANTITY,SIZE,PRICE,BRAND_ID,COLOR_ID,PRODUCT_CATEGORY_ID) VALUES
  ('FULL TSHIRT',200,'XXL',300,4,2,3);
  INSERT INTO PRODUCTCATALOG_PRODUCT(NAME,QUANTITY,SIZE,PRICE,BRAND_ID,COLOR_ID,PRODUCT_CATEGORY_ID) VALUES
  ('POLO TSHIRT',200,'XXL',300,4,1,3);