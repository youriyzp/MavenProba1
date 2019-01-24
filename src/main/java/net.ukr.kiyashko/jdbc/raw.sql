CREATE SCHEMA store;

CREATE TABLE store.products
(
  id SERIAL,
  title character varying(255),
  price numeric,
  created_at timestamp with time zone,
  tags character varying(255)[],
  CONSTRAINT products_pkey PRIMARY KEY (id)
);


CREATE SEQUENCE store.users_id_seq
  INCREMENT 1
  MINVALUE 0
  MAXVALUE 1000000
  START 0
  CACHE 1000;
ALTER TABLE store.users_id_seq
  OWNER TO postgres;


CREATE TABLE store.users
(
  id integer NOT NULL DEFAULT nextval('store.users_id_seq'::regclass),
  email character varying(255),
  password character varying(255),
  address text,
  created_at timestamp with time zone,
  CONSTRAINT users_pkey PRIMARY KEY (id)
);

CREATE SEQUENCE store.purchases_id_seq
  INCREMENT 1
  MINVALUE 0
  MAXVALUE 1000000
  START 0
  CACHE 1000;
ALTER TABLE store.purchases_id_seq
  OWNER TO postgres;

CREATE TABLE store.purchases
(
  id integer NOT NULL DEFAULT nextval('store.purchases_id_seq'::regclass),
  created_at timestamp with time zone,
  name character varying(255),
  address character varying(255),
  state character varying(2),
  zipcode integer,
  user_id integer,
  CONSTRAINT purchases_pkey PRIMARY KEY (id),
  CONSTRAINT purchases_user_id_fkey FOREIGN KEY (user_id)
      REFERENCES store.users (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE TABLE store.purchase_items
(
  id SERIAL,
  purchase_id integer,
  product_id integer,
  price numeric,
  quantity integer,
  state character varying(255),
  CONSTRAINT purchase_items_product_id_fkey FOREIGN KEY (product_id)
      REFERENCES store.products (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT purchase_items_purchase_id_fkey FOREIGN KEY (purchase_id)
      REFERENCES store.purchases (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
