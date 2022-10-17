
0) and ($len_cat_tl > 0) and ($len_cat_de > 0)){ $sql = "insert into categories (category_id, title, description)"; $sql .= " values ('$Cat_ID', '$Cat_Title', '$Cat_Desc')"; $result = $db->query($sql); $db->commit( ); } else { echo "

Please make sure all fields are filled in "; echo "and try again.
\n"; } } docstore.mik.ua/orelly/webprog/php/ch08_05.htm

fetchRow( )){ echo "$row[0]$row[1]$row[2]\n"; } ?> docstore.mik.ua/orelly/webprog/php/ch08_05.htm


tr> docstore.mik.ua/orelly/webprog/php/ch08_05.htm

// check for Oracle 8 - data source name syntax is different if ($phptype != 'oci8'){ $dsn = "$phptype://$username:$password@$hostspec/$database"; } else { $net8name = 'www'; $dsn = "$phptype://$username:$password@$net8name"; } // establish the connection $db = DB::connect($dsn); if (DB::isError($db)) { die ($db->getMessage( )); } ?> docstore.mik.ua/orelly/webprog/php/ch08_05.htm