PGDMP     2    %                 |            DeviceRegistry    14.5    14.5 4    0           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            1           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            2           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            3           1262    24588    DeviceRegistry    DATABASE     e   CREATE DATABASE "DeviceRegistry" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'en_US.UTF-8';
     DROP DATABASE "DeviceRegistry";
                postgres    false                        2615    26705    reserve    SCHEMA        CREATE SCHEMA reserve;
    DROP SCHEMA reserve;
                postgres    false            �            1259    26601    computer_models    TABLE     �  CREATE TABLE public.computer_models (
    id bigint NOT NULL,
    availability boolean NOT NULL,
    color character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    price real NOT NULL,
    serial_number character varying(255) NOT NULL,
    size character varying(255) NOT NULL,
    category character varying(255) NOT NULL,
    processor_type character varying(255) NOT NULL,
    registry_fk bigint
);
 #   DROP TABLE public.computer_models;
       public         heap    postgres    false            �            1259    26600    computer_models_id_seq    SEQUENCE        CREATE SEQUENCE public.computer_models_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.computer_models_id_seq;
       public          postgres    false    211            4           0    0    computer_models_id_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.computer_models_id_seq OWNED BY public.computer_models.id;
          public          postgres    false    210            �            1259    26610    refrigerator_models    TABLE     �  CREATE TABLE public.refrigerator_models (
    id bigint NOT NULL,
    availability boolean NOT NULL,
    color character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    price real NOT NULL,
    serial_number character varying(255) NOT NULL,
    size character varying(255) NOT NULL,
    compressor_type character varying(255) NOT NULL,
    doors_number integer NOT NULL,
    registry_fk bigint
);
 '   DROP TABLE public.refrigerator_models;
       public         heap    postgres    false            �            1259    26609    refrigerator_models_id_seq    SEQUENCE     �   CREATE SEQUENCE public.refrigerator_models_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.refrigerator_models_id_seq;
       public          postgres    false    213            5           0    0    refrigerator_models_id_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.refrigerator_models_id_seq OWNED BY public.refrigerator_models.id;
          public          postgres    false    212            �            1259    26672    registry    TABLE     L  CREATE TABLE public.registry (
    id bigint NOT NULL,
    installment_plan boolean NOT NULL,
    manufacturer_company character varying(255) NOT NULL,
    manufacturer_country character varying(255) NOT NULL,
    online_order boolean NOT NULL,
    tech_name character varying(255) NOT NULL,
    tech_type character varying(255)
);
    DROP TABLE public.registry;
       public         heap    postgres    false            �            1259    26671    registry_id_seq    SEQUENCE     x   CREATE SEQUENCE public.registry_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.registry_id_seq;
       public          postgres    false    221            6           0    0    registry_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.registry_id_seq OWNED BY public.registry.id;
          public          postgres    false    220            �            1259    26619    smartphone_models    TABLE     �  CREATE TABLE public.smartphone_models (
    id bigint NOT NULL,
    availability boolean NOT NULL,
    color character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    price real NOT NULL,
    serial_number character varying(255) NOT NULL,
    size character varying(255) NOT NULL,
    cameras_number integer NOT NULL,
    storage_size integer NOT NULL,
    registry_fk bigint
);
 %   DROP TABLE public.smartphone_models;
       public         heap    postgres    false            �            1259    26618    smartphone_models_id_seq    SEQUENCE     �   CREATE SEQUENCE public.smartphone_models_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.smartphone_models_id_seq;
       public          postgres    false    215            7           0    0    smartphone_models_id_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.smartphone_models_id_seq OWNED BY public.smartphone_models.id;
          public          postgres    false    214            �            1259    26628 	   tv_models    TABLE     �  CREATE TABLE public.tv_models (
    id bigint NOT NULL,
    availability boolean NOT NULL,
    color character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    price real NOT NULL,
    serial_number character varying(255) NOT NULL,
    size character varying(255) NOT NULL,
    category character varying(255) NOT NULL,
    technology character varying(255) NOT NULL,
    registry_fk bigint
);
    DROP TABLE public.tv_models;
       public         heap    postgres    false            �            1259    26627    tv_models_id_seq    SEQUENCE     y   CREATE SEQUENCE public.tv_models_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.tv_models_id_seq;
       public          postgres    false    217            8           0    0    tv_models_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.tv_models_id_seq OWNED BY public.tv_models.id;
          public          postgres    false    216            �            1259    26637    vacuum_models    TABLE     �  CREATE TABLE public.vacuum_models (
    id bigint NOT NULL,
    availability boolean NOT NULL,
    color character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    price real NOT NULL,
    serial_number character varying(255) NOT NULL,
    size character varying(255) NOT NULL,
    container_volume real NOT NULL,
    modes_number integer NOT NULL,
    registry_fk bigint
);
 !   DROP TABLE public.vacuum_models;
       public         heap    postgres    false            �            1259    26636    vacuum_models_id_seq    SEQUENCE     }   CREATE SEQUENCE public.vacuum_models_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.vacuum_models_id_seq;
       public          postgres    false    219            9           0    0    vacuum_models_id_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.vacuum_models_id_seq OWNED BY public.vacuum_models.id;
          public          postgres    false    218            �           2604    26604    computer_models id    DEFAULT     x   ALTER TABLE ONLY public.computer_models ALTER COLUMN id SET DEFAULT nextval('public.computer_models_id_seq'::regclass);
 A   ALTER TABLE public.computer_models ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    210    211    211            �           2604    26613    refrigerator_models id    DEFAULT     �   ALTER TABLE ONLY public.refrigerator_models ALTER COLUMN id SET DEFAULT nextval('public.refrigerator_models_id_seq'::regclass);
 E   ALTER TABLE public.refrigerator_models ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    212    213    213            �           2604    26675    registry id    DEFAULT     j   ALTER TABLE ONLY public.registry ALTER COLUMN id SET DEFAULT nextval('public.registry_id_seq'::regclass);
 :   ALTER TABLE public.registry ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    221    220    221            �           2604    26622    smartphone_models id    DEFAULT     |   ALTER TABLE ONLY public.smartphone_models ALTER COLUMN id SET DEFAULT nextval('public.smartphone_models_id_seq'::regclass);
 C   ALTER TABLE public.smartphone_models ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    215    214    215            �           2604    26631    tv_models id    DEFAULT     l   ALTER TABLE ONLY public.tv_models ALTER COLUMN id SET DEFAULT nextval('public.tv_models_id_seq'::regclass);
 ;   ALTER TABLE public.tv_models ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    216    217    217            �           2604    26640    vacuum_models id    DEFAULT     t   ALTER TABLE ONLY public.vacuum_models ALTER COLUMN id SET DEFAULT nextval('public.vacuum_models_id_seq'::regclass);
 ?   ALTER TABLE public.vacuum_models ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    219    218    219            #          0    26601    computer_models 
   TABLE DATA           �   COPY public.computer_models (id, availability, color, name, price, serial_number, size, category, processor_type, registry_fk) FROM stdin;
    public          postgres    false    211   jB       %          0    26610    refrigerator_models 
   TABLE DATA           �   COPY public.refrigerator_models (id, availability, color, name, price, serial_number, size, compressor_type, doors_number, registry_fk) FROM stdin;
    public          postgres    false    213   �C       -          0    26672    registry 
   TABLE DATA           �   COPY public.registry (id, installment_plan, manufacturer_company, manufacturer_country, online_order, tech_name, tech_type) FROM stdin;
    public          postgres    false    221   �D       '          0    26619    smartphone_models 
   TABLE DATA           �   COPY public.smartphone_models (id, availability, color, name, price, serial_number, size, cameras_number, storage_size, registry_fk) FROM stdin;
    public          postgres    false    215   qF       )          0    26628 	   tv_models 
   TABLE DATA           �   COPY public.tv_models (id, availability, color, name, price, serial_number, size, category, technology, registry_fk) FROM stdin;
    public          postgres    false    217   qG       +          0    26637    vacuum_models 
   TABLE DATA           �   COPY public.vacuum_models (id, availability, color, name, price, serial_number, size, container_volume, modes_number, registry_fk) FROM stdin;
    public          postgres    false    219   `H       :           0    0    computer_models_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.computer_models_id_seq', 8, true);
          public          postgres    false    210            ;           0    0    refrigerator_models_id_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.refrigerator_models_id_seq', 7, true);
          public          postgres    false    212            <           0    0    registry_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.registry_id_seq', 16, true);
          public          postgres    false    220            =           0    0    smartphone_models_id_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.smartphone_models_id_seq', 6, true);
          public          postgres    false    214            >           0    0    tv_models_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.tv_models_id_seq', 6, true);
          public          postgres    false    216            ?           0    0    vacuum_models_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.vacuum_models_id_seq', 6, true);
          public          postgres    false    218            �           2606    26608 $   computer_models computer_models_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.computer_models
    ADD CONSTRAINT computer_models_pkey PRIMARY KEY (id);
 N   ALTER TABLE ONLY public.computer_models DROP CONSTRAINT computer_models_pkey;
       public            postgres    false    211            �           2606    26617 ,   refrigerator_models refrigerator_models_pkey 
   CONSTRAINT     j   ALTER TABLE ONLY public.refrigerator_models
    ADD CONSTRAINT refrigerator_models_pkey PRIMARY KEY (id);
 V   ALTER TABLE ONLY public.refrigerator_models DROP CONSTRAINT refrigerator_models_pkey;
       public            postgres    false    213            �           2606    26679    registry registry_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.registry
    ADD CONSTRAINT registry_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.registry DROP CONSTRAINT registry_pkey;
       public            postgres    false    221            �           2606    26626 (   smartphone_models smartphone_models_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.smartphone_models
    ADD CONSTRAINT smartphone_models_pkey PRIMARY KEY (id);
 R   ALTER TABLE ONLY public.smartphone_models DROP CONSTRAINT smartphone_models_pkey;
       public            postgres    false    215            �           2606    26635    tv_models tv_models_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.tv_models
    ADD CONSTRAINT tv_models_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.tv_models DROP CONSTRAINT tv_models_pkey;
       public            postgres    false    217            �           2606    26644     vacuum_models vacuum_models_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.vacuum_models
    ADD CONSTRAINT vacuum_models_pkey PRIMARY KEY (id);
 J   ALTER TABLE ONLY public.vacuum_models DROP CONSTRAINT vacuum_models_pkey;
       public            postgres    false    219            �           2606    26680 +   computer_models fkcuib1hv8m30gx80xbw8y5dhss    FK CONSTRAINT     �   ALTER TABLE ONLY public.computer_models
    ADD CONSTRAINT fkcuib1hv8m30gx80xbw8y5dhss FOREIGN KEY (registry_fk) REFERENCES public.registry(id);
 U   ALTER TABLE ONLY public.computer_models DROP CONSTRAINT fkcuib1hv8m30gx80xbw8y5dhss;
       public          postgres    false    211    3473    221            �           2606    26695 %   tv_models fkf6namkvtxpr8l891iwrjwpsmw    FK CONSTRAINT     �   ALTER TABLE ONLY public.tv_models
    ADD CONSTRAINT fkf6namkvtxpr8l891iwrjwpsmw FOREIGN KEY (registry_fk) REFERENCES public.registry(id);
 O   ALTER TABLE ONLY public.tv_models DROP CONSTRAINT fkf6namkvtxpr8l891iwrjwpsmw;
       public          postgres    false    221    3473    217            �           2606    26685 /   refrigerator_models fkmqrqi322egso6j8t94wurfgh1    FK CONSTRAINT     �   ALTER TABLE ONLY public.refrigerator_models
    ADD CONSTRAINT fkmqrqi322egso6j8t94wurfgh1 FOREIGN KEY (registry_fk) REFERENCES public.registry(id);
 Y   ALTER TABLE ONLY public.refrigerator_models DROP CONSTRAINT fkmqrqi322egso6j8t94wurfgh1;
       public          postgres    false    221    3473    213            �           2606    26700 )   vacuum_models fkprgq8j25gw3d77lhxe09hi2xo    FK CONSTRAINT     �   ALTER TABLE ONLY public.vacuum_models
    ADD CONSTRAINT fkprgq8j25gw3d77lhxe09hi2xo FOREIGN KEY (registry_fk) REFERENCES public.registry(id);
 S   ALTER TABLE ONLY public.vacuum_models DROP CONSTRAINT fkprgq8j25gw3d77lhxe09hi2xo;
       public          postgres    false    221    219    3473            �           2606    26690 -   smartphone_models fktfwo2776nr57tq3n5933u9we6    FK CONSTRAINT     �   ALTER TABLE ONLY public.smartphone_models
    ADD CONSTRAINT fktfwo2776nr57tq3n5933u9we6 FOREIGN KEY (registry_fk) REFERENCES public.registry(id);
 W   ALTER TABLE ONLY public.smartphone_models DROP CONSTRAINT fktfwo2776nr57tq3n5933u9we6;
       public          postgres    false    221    3473    215            #   S  x�}��k�0���_�?��K���*�j�������+��Hq�����:��<݇��1�!*����6�vOӃ����y��C_�2\E�g	19�H��		IVն�YY���������i�	�7���)/{�+y�s�7�=?����%oD�����̛ �E@j����nl���~6Ea? 1�=Z:ۙ��vT�����|��l3~� pZ�0�6(R6�ݠ�H?h��3W)'T�y��:��a>�=�����Hcm^���d���Ӭ���YQ=�4͎y�ےN��9F�x��b��st�V��H���Ӝ�B�}���g��\����T��{B�7�n      %     x�m��J�@�ϳO�O ;3�d�heM�JZS)^�D�F$����9cI���|��3�0@�~x9B�{�'��}e�����=fc9M
H��vo��.EY����p��qd�1sЈ!:��#��Gߝ�ڑ�[��k�z�!l�Vq]������H4����{Q<�ׂ9O�����$��K����<U8t��AXvS�ڛ�H\X�?:B�q+��
?'�y!�,nCx�/j&���'��g2�Cw��bVd.
6�9�r���#��+��r�r�      -   n  x����R�0���S��/K� T���ʸ`sl4C��	)з7��bu����s��[�i�s�tA� �b{P̰	�Z"�%�rЦ�H�׵^��Tk>��MJ$[ۤs�g&e�&�/�.�	H8T��n�;,
;#P	�3�����%�����	�#�x��4�\��9(�>J��;;+�m&>�G*�Pԡ4�C�m� ���xǷ���e�K��{p�j*��xĞ4�$smq��>Z}
5�+�ƍ�b�7�%����p���dY���Jq+��<��U,0 +Ǔ)H(�T���5G��SE\�V��S[p�e��vg��P#)�DS��Ҹ�4�K4�:�d:e��Щ!a'd������
Ɉh�CMgv��<�����      '   �   x�]��N�0���+���Nb�	���P�6�mP��{6)�P-���	�xڶC��ﾾ�]���A�\)���aW�<K�%��H1\F��qn�Lz�ރ���yS���&�9�d�1v?��n�n��v(frЬ���W�s��d�20ow���d������M�\��Y��]�ရ�m��h�z��T�X;n�sfrF�w��\�t��j��ln:��Q�J�_H�Y-      )   �   x�e��J�@��_�_ 3�����6�
ł ���b�`[X��M4���p�e�q��k^߱=��]���X"�v>�,��$aW�ԋ
����p��Ȁ�����`�׮��w&��\��A��ԫʋѐH�Nb��N�)���<"q�x!3�M�+&�e��j���|���{�nO��鰂5C�f#��)ߐ�FoU�/���_@.�+��R���/wJ�u&R�      +   �   x�]��j�0���)�]�8���,���Ҋz�%�,��
�B����Cs	!���	޹;�vp����Z���с㥢�Q��IB���;"�<��:BJ(�a�h�o��͎�{�̾w�2� 7)ui(E�Xl.&�2$�~�;�����N���JW���4��1M��<��k?:{���3o�����7�_�	��t5}Wo��� �1H��HX|�&> 7[*���x5�?�nA�)�
d�o �[%����[^�     