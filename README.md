####Joined:
-----------
```
Hibernate: insert into domain_root (domain_value, domain_root_id) values (?, ?)
Hibernate: insert into parent_document (document_type, parent_value, parent_id) values (?, ?, ?)
Hibernate: insert into parent_document (document_type, parent_value, parent_id) values (?, ?, ?)
Hibernate: insert into parent_document (document_type, parent_value, parent_id) values (?, ?, ?)
Hibernate: insert into associated_document (primary_document_id, linked_document_id) values (?, ?)
Hibernate: insert into parent_document (document_type, parent_value, parent_id) values (?, ?, ?)
Hibernate: insert into child_a_document (childametaa, parent_id) values (?, ?)
Hibernate: insert into associated_document (primary_document_id, linked_document_id) values (?, ?)
Hibernate: insert into parent_document (document_type, parent_value, parent_id) values (?, ?, ?)
Hibernate: insert into child_b_document (childbmetaa, parent_id) values (?, ?)
Hibernate: insert into associated_document (primary_document_id, linked_document_id) values (?, ?)
Hibernate: insert into domain_root_parent_documents (domain_root_domain_root_id, parent_documents_parent_id) values (?, ?)
Hibernate: insert into domain_root_parent_documents (domain_root_domain_root_id, parent_documents_parent_id) values (?, ?)
Hibernate: insert into domain_root_parent_documents (domain_root_domain_root_id, parent_documents_parent_id) values (?, ?)
Hibernate: insert into domain_root_parent_documents (domain_root_domain_root_id, parent_documents_parent_id) values (?, ?)
Hibernate: insert into domain_root_parent_documents (domain_root_domain_root_id, parent_documents_parent_id) values (?, ?)
2022-11-21 21:48:59.231  INFO 40415 --- [           main] i.StatisticalLoggingSessionEventListener : Session Metrics {
50541 nanoseconds spent acquiring 1 JDBC connections;
0 nanoseconds spent releasing 0 JDBC connections;
4329333 nanoseconds spent preparing 22 JDBC statements;     ------>4.329333<-------
10592585 nanoseconds spent executing 22 JDBC statements;    ------>10.592585<-------
0 nanoseconds spent executing 0 JDBC batches;
0 nanoseconds spent performing 0 L2C puts;
0 nanoseconds spent performing 0 L2C hits;
0 nanoseconds spent performing 0 L2C misses;
18916625 nanoseconds spent executing 1 flushes (flushing a total of 6 entities and 1 collections);
0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
}
Hibernate: select domainroot0_.domain_root_id as domain_r1_3_, domainroot0_.domain_value as domain_v2_3_ from domain_root domainroot0_
Hibernate: select parentdocu0_.domain_root_domain_root_id as domain_r1_4_0_, parentdocu0_.parent_documents_parent_id as parent_d2_4_0_, parentdocu1_.parent_id as parent_i1_5_1_, parentdocu1_.document_type as document2_5_1_, parentdocu1_.parent_value as parent_v3_5_1_, parentdocu1_3_.primary_document_id as primary_1_0_1_, parentdocu1_1_.childametaa as childame1_1_1_, parentdocu1_2_.childbmetaa as childbme1_2_1_, case when parentdocu1_1_.parent_id is not null then 1 when parentdocu1_2_.parent_id is not null then 2 when parentdocu1_.parent_id is not null then 0 end as clazz_1_, parentdocu2_.parent_id as parent_i1_5_2_, parentdocu2_.document_type as document2_5_2_, parentdocu2_.parent_value as parent_v3_5_2_, parentdocu2_3_.primary_document_id as primary_1_0_2_, parentdocu2_1_.childametaa as childame1_1_2_, parentdocu2_2_.childbmetaa as childbme1_2_2_, case when parentdocu2_1_.parent_id is not null then 1 when parentdocu2_2_.parent_id is not null then 2 when parentdocu2_.parent_id is not null then 0 end as clazz_2_ from domain_root_parent_documents parentdocu0_ inner join parent_document parentdocu1_ on parentdocu0_.parent_documents_parent_id=parentdocu1_.parent_id left outer join child_a_document parentdocu1_1_ on parentdocu1_.parent_id=parentdocu1_1_.parent_id left outer join child_b_document parentdocu1_2_ on parentdocu1_.parent_id=parentdocu1_2_.parent_id left outer join associated_document parentdocu1_3_ on parentdocu1_.parent_id=parentdocu1_3_.linked_document_id left outer join parent_document parentdocu2_ on parentdocu1_3_.primary_document_id=parentdocu2_.parent_id left outer join child_a_document parentdocu2_1_ on parentdocu2_.parent_id=parentdocu2_1_.parent_id left outer join child_b_document parentdocu2_2_ on parentdocu2_.parent_id=parentdocu2_2_.parent_id left outer join associated_document parentdocu2_3_ on parentdocu2_.parent_id=parentdocu2_3_.linked_document_id where parentdocu0_.domain_root_domain_root_id=?
2022-11-21 21:48:59.341  INFO 40415 --- [           main] i.StatisticalLoggingSessionEventListener : Session Metrics {
17583 nanoseconds spent acquiring 1 JDBC connections;
0 nanoseconds spent releasing 0 JDBC connections;
3241875 nanoseconds spent preparing 2 JDBC statements;      ------>3.241875<-------
1808709 nanoseconds spent executing 2 JDBC statements;      ------>1.808709<-------
0 nanoseconds spent executing 0 JDBC batches;
0 nanoseconds spent performing 0 L2C puts;
0 nanoseconds spent performing 0 L2C hits;
0 nanoseconds spent performing 0 L2C misses;
0 nanoseconds spent executing 0 flushes (flushing a total of 0 entities and 0 collections);
12667 nanoseconds spent executing 1 partial-flushes (flushing a total of 0 entities and 0 collections)
}
```

####Single Table:
-----------------
```
Hibernate: insert into single_js_domain_root (domain_value, domain_root_id) values (?, ?)
Hibernate: insert into single_js_parent_document (document_type, parent_value, dtype, parent_id) values (?, ?, 'single_js_parent_document', ?)
Hibernate: insert into single_js_parent_document (document_type, parent_value, dtype, parent_id) values (?, ?, 'single_js_parent_document', ?)
Hibernate: insert into single_js_parent_document (document_type, parent_value, dtype, parent_id) values (?, ?, 'single_js_parent_document', ?)
Hibernate: insert into single_js_associated_document (primary_document_id, linked_document_id) values (?, ?)
Hibernate: insert into single_js_parent_document (document_type, parent_value, meta_details, dtype, parent_id) values (?, ?, ?, 'single_js_child_a_document', ?)
Hibernate: insert into single_js_associated_document (primary_document_id, linked_document_id) values (?, ?)
Hibernate: insert into single_js_parent_document (document_type, parent_value, meta_details, dtype, parent_id) values (?, ?, ?, 'single_js_child_b_document', ?)
Hibernate: insert into single_js_associated_document (primary_document_id, linked_document_id) values (?, ?)
Hibernate: insert into single_js_domain_root_parent_documents (single_js_domain_root_domain_root_id, parent_documents_parent_id) values (?, ?)
Hibernate: insert into single_js_domain_root_parent_documents (single_js_domain_root_domain_root_id, parent_documents_parent_id) values (?, ?)
Hibernate: insert into single_js_domain_root_parent_documents (single_js_domain_root_domain_root_id, parent_documents_parent_id) values (?, ?)
Hibernate: insert into single_js_domain_root_parent_documents (single_js_domain_root_domain_root_id, parent_documents_parent_id) values (?, ?)
Hibernate: insert into single_js_domain_root_parent_documents (single_js_domain_root_domain_root_id, parent_documents_parent_id) values (?, ?)
2022-11-21 21:53:55.675  INFO 40757 --- [           main] i.StatisticalLoggingSessionEventListener : Session Metrics {
50916 nanoseconds spent acquiring 1 JDBC connections;
0 nanoseconds spent releasing 0 JDBC connections;
3731920 nanoseconds spent preparing 20 JDBC statements;     ------>3.73192<-------
9891250 nanoseconds spent executing 20 JDBC statements;     ------>9.89125<-------
0 nanoseconds spent executing 0 JDBC batches;
0 nanoseconds spent performing 0 L2C puts;
0 nanoseconds spent performing 0 L2C hits;
0 nanoseconds spent performing 0 L2C misses;
21407334 nanoseconds spent executing 1 flushes (flushing a total of 6 entities and 1 collections);
0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
}
103
Hibernate: select domainroot0_.domain_root_id as domain_r1_7_, domainroot0_.domain_value as domain_v2_7_ from single_js_domain_root domainroot0_
Hibernate: select parentdocu0_.single_js_domain_root_domain_root_id as single_j1_8_0_, parentdocu0_.parent_documents_parent_id as parent_d2_8_0_, parentdocu1_.parent_id as parent_i2_9_1_, parentdocu1_.document_type as document3_9_1_, parentdocu1_.parent_value as parent_v4_9_1_, parentdocu1_1_.primary_document_id as primary_1_6_1_, parentdocu1_.meta_details as meta_det5_9_1_, parentdocu1_.dtype as dtype1_9_1_, parentdocu2_.parent_id as parent_i2_9_2_, parentdocu2_.document_type as document3_9_2_, parentdocu2_.parent_value as parent_v4_9_2_, parentdocu2_1_.primary_document_id as primary_1_6_2_, parentdocu2_.meta_details as meta_det5_9_2_, parentdocu2_.dtype as dtype1_9_2_ from single_js_domain_root_parent_documents parentdocu0_ inner join single_js_parent_document parentdocu1_ on parentdocu0_.parent_documents_parent_id=parentdocu1_.parent_id left outer join single_js_associated_document parentdocu1_1_ on parentdocu1_.parent_id=parentdocu1_1_.linked_document_id left outer join single_js_parent_document parentdocu2_ on parentdocu1_1_.primary_document_id=parentdocu2_.parent_id left outer join single_js_associated_document parentdocu2_1_ on parentdocu2_.parent_id=parentdocu2_1_.linked_document_id where parentdocu0_.single_js_domain_root_domain_root_id=?
2022-11-21 21:53:55.760  INFO 40757 --- [           main] i.StatisticalLoggingSessionEventListener : Session Metrics {
13834 nanoseconds spent acquiring 1 JDBC connections;
0 nanoseconds spent releasing 0 JDBC connections;
1901791 nanoseconds spent preparing 2 JDBC statements;      ------>1.901791<-------
812209 nanoseconds spent executing 2 JDBC statements;       ------>0.812209<-------
0 nanoseconds spent executing 0 JDBC batches;
0 nanoseconds spent performing 0 L2C puts;
0 nanoseconds spent performing 0 L2C hits;
0 nanoseconds spent performing 0 L2C misses;
0 nanoseconds spent executing 0 flushes (flushing a total of 0 entities and 0 collections);
11041 nanoseconds spent executing 1 partial-flushes (flushing a total of 0 entities and 0 collections)
}
```