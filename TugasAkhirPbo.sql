PGDMP     /                    {            Perpus    15.2    15.2                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    25334    Perpus    DATABASE     �   CREATE DATABASE "Perpus" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Indonesian_Indonesia.1252';
    DROP DATABASE "Perpus";
                postgres    false            �            1259    25472    buku    TABLE       CREATE TABLE public.buku (
    isbn character varying(20) NOT NULL,
    judul character varying(255),
    subjudul character varying(255),
    penulis character varying(100),
    penerbit character varying(100),
    tahun_terbit integer,
    jumlah_halaman integer
);
    DROP TABLE public.buku;
       public         heap    postgres    false            �            1259    25350    login    TABLE     y   CREATE TABLE public.login (
    username character varying(50) NOT NULL,
    password character varying(255) NOT NULL
);
    DROP TABLE public.login;
       public         heap    postgres    false            �            1259    25670 
   peminjaman    TABLE     M  CREATE TABLE public.peminjaman (
    id_pengguna integer NOT NULL,
    isbn character varying(20),
    nama character varying(255),
    semester integer,
    jurusan character varying(255),
    angkatan integer,
    status character varying(20),
    tanggal_peminjaman date,
    tanggal_pengembalian date,
    jumlah_buku integer
);
    DROP TABLE public.peminjaman;
       public         heap    postgres    false            �            1259    25345    skripsi    TABLE     �   CREATE TABLE public.skripsi (
    id_skripsi integer NOT NULL,
    judul character varying(255) NOT NULL,
    penulis character varying(100),
    jumlah_halaman integer,
    tahun_terbit integer
);
    DROP TABLE public.skripsi;
       public         heap    postgres    false            	          0    25472    buku 
   TABLE DATA                 public          postgres    false    216   �                 0    25350    login 
   TABLE DATA                 public          postgres    false    215   �(       
          0    25670 
   peminjaman 
   TABLE DATA                 public          postgres    false    217   �(                 0    25345    skripsi 
   TABLE DATA                 public          postgres    false    214   c*       u           2606    25478    buku buku_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.buku
    ADD CONSTRAINT buku_pkey PRIMARY KEY (isbn);
 8   ALTER TABLE ONLY public.buku DROP CONSTRAINT buku_pkey;
       public            postgres    false    216            s           2606    25354    login login_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.login
    ADD CONSTRAINT login_pkey PRIMARY KEY (username);
 :   ALTER TABLE ONLY public.login DROP CONSTRAINT login_pkey;
       public            postgres    false    215            w           2606    25676    peminjaman peminjaman_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.peminjaman
    ADD CONSTRAINT peminjaman_pkey PRIMARY KEY (id_pengguna);
 D   ALTER TABLE ONLY public.peminjaman DROP CONSTRAINT peminjaman_pkey;
       public            postgres    false    217            q           2606    25349    skripsi skripsi_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.skripsi
    ADD CONSTRAINT skripsi_pkey PRIMARY KEY (id_skripsi);
 >   ALTER TABLE ONLY public.skripsi DROP CONSTRAINT skripsi_pkey;
       public            postgres    false    214            x           2606    25677    peminjaman peminjaman_isbn_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.peminjaman
    ADD CONSTRAINT peminjaman_isbn_fkey FOREIGN KEY (isbn) REFERENCES public.buku(isbn) NOT VALID;
 I   ALTER TABLE ONLY public.peminjaman DROP CONSTRAINT peminjaman_isbn_fkey;
       public          postgres    false    3189    216    217            	      x��\ko�H��>��l����;�dǊѵ�5f-�%��h�dǣ��{���D˞�6w?�#RY]]u�ԃ3��]����n��m�"�˳�5��w�p1c'��f{�n�;e�n��#6���9���?�'t�K�k��G�K:|���<|p�n���_~�|�a�^��u[��6Z�V�<�J�Jd�K~�b��mD�(��t��_$2Y�<q*�	�Yq	�d��Y�����f��l�}�b��T�\�K�R�>�_�ƝS&"�Jd�?���^<��J'���<ޘ�:�S���Z�n��w��ص��<�rFwMD&9~��A��d��$�8/x��	K����ީ�q)���&�d�f"ߪT&���d�T�du�N��鵝^�4�tǭOٚ�(|��o�D��)��o��d�4g#�d:ʱi����깵��i6z��Uᵎ7:�4�F�^�Kl}a%�T$<bs��k���
YYŝ�%k�[��^'룵�r��T�����}`�.��P'{��2�N��oZ����'��%�y�5�=��j6�9d�8�����3�/�3�C��5g�3���f�N�S��zmq�ѣ[�@+	�e�s����Bݥg��"��ᅯ?�^�o��Ao��ڍΠc-��L�Ek�� �����F�9}�2/�ٖp���l�����5t�ߒv=r��.>����P.��� Y��]�P��_��kH_o�@ �D�]��a�I�Ic7l?=N��� Ү�[n��5�Ry�p���U�YD�-���	�O�7t<~�dW�[�Ζ�����t��.��;����t~ޤ�4�J8�y�sx��!Yg̗� 6�UWEww�w��@2V<8e3 q ��_���,NƳ��7kmy��p�V�*��LD�����0�+��E��y���q����#�@��]��{��I���Ul�Ϡ�$�r�����Q>V�8z�?Xa�
Ȇ}�[a�m�2�N�� 7+�S����У_1e�_�ڬ+0����@؏P��h�7B�1������\���;Â�����$�$1�̴Y7��< ��9_�|u������n����z2T�`w�a���D�*�S@�Rtn�[����N/`���M'0H�{�'1�{t�H<p����Y�9�S9�	���3�2�~����Z���Tʮ@x�Q���N�~]��
�ɥ�~���_`c±\�?Tf��/��d��@|
3 �0`���AF�M�~�Z3�w�!a��~[�s�-pIc|#8C�:0y�ay�T-Ef! ��I����n�qf�?K���FDj�}�,�t\�m}���N�ҭ� 6� ��e"�`���!G�|�ѝ^��t�	�tꙨ������-j0*v�r�����!��~�"�ٓq�/d$��9�&���n��j��7�`Ծ���uv�)89��x�d\�����zzX
z�t�Z=��V�2%��W+p&cB�<Q��i�\N-!��n�it��s��f������k����gs�P�К�����GI)x%�[5�Z)\I�悻���+�"d����i��ݟ~}�@R4�����4U��-�_��
��!��������^l���]��U�-d@K�V*J��,xΜD����������K��YRRu�#� KK���n<�105�M�<4CL@�,��`�AŊ.L<1DFXq��<1��X�m��R�m��r��$=��7�R��+��"T������5=60� ��E��S#s���PVw`37��-�O��VE1��`Ira��������z��V��&\kG���T&�w�	���o��
����,aӳ��n-B: ��6܆[�{�ّ��F"&iU�[D���
�]�qfbXՈ��R¶I�����	�)~@z�L�	p{n(�¡ ԃ�a�/0$�/�q��V<��o�*�cb��S9 =`7��T�a#Q����Z��,�M�j��-A�A1i� ���9A��fK)��`�Kh���S���.���fs�����K������|v��P$6f�h�-B$�)��=R���*�Z&�c!66�$��Z	-�Uo�XqM������~(�=��)1���<d�M>��Zh�nw�A!D�Ӂ&���X,��H�O�$�d|�n��G4���P*��B���v �*l���g���յ�� r���U���A8���6��~�c�y�ɦ��U�f�t��*�9�Ȟǖo��z�
$��j������TD�(�铂��vE�m�1���!n����e­9�"��J��6"\�\Sp����&2N�<0x%�L�5E�����,7|QЫW|�u��	N��>�M���T�[�d =��+hb��"F1v�P�p>���6��+M���o�����,��Ly.m������x��S	.a���qV�5˝��v<~�z�ϦJ�6�8&cF��� �!u`�-ݓ]I�Պ"\��yP���썻�N�i=��5���[
�I�k����g�넪���<�/##'p��T⨄���������"�+EX��h�}��
Y��,��'z�<���3���lnk�/�~��X��ɇ�{6�����;l��Z��E���)� �8�`�@اf�ԬH���l����X���/�ľ*�~{&�w�."[�*��O|��S[ɖK�E��ٶ�&1?��E�oͨ6�.e�J�س�3����������* ��C����#�j4�(ɀ5�T-��8���<C{����4ݲ	��*
O�8�4��bY�V�m;H�wJ�@B��� p,�̩�j����|*Jww��X��)݈�F���=A��ˌ��AĬke|��Z��s�G!h Ο��6�i�xjc�A�\�c��(}�{p��y�ZTK��y�} 鐋���mA�^�\�لrJ+�	X���=��;j�~ ���i�o�c���'���Y��A>6�v&F�i�H2��xص�_(֮����2���e�٘b�&��gI��U���"�۪�p�ѵɈ�>*���b��"���vE�k���	Jru$�-u هH-L.����G-;]X]�c�ʗ�-[�*f�T���W,�d���R�_�5�5�SS�|7Â⃤�^iD��+�o/�<H�^l.cq�#a2p�2�b���̔/S�I�kb8�/7�>�U��Y
x���!:�҇L��`�{�ʓ�ڃF��y@]	��d��0���f<���n�gQq22o	'���r����L=�����P����H��B6<���-r�Ÿ�ˀ2��ڶ�-��]�����s����72$:�>-2��9nE$�8�;	�^A�R~P����L�5,�hc�m��e]KdT�Aj��ဎS��&�k����R��� W(JO�EF%��T�7�@	v�Ė���Qf
j["f���xC�{��E(�{�K*0�P��1=��g�DL�b�jU��i�+؛mo�Xs'���x�3VĜ���b+���5:)��%�J��j���{�6��%F�]�������̭�j:�LV�Yٯ��~��_uQ��^����AL�#l����Kw.��f黈�3 'x<�Fe�1��|�Zn�Ҟ�ER��Q����䙦u�v�E�V��u���v��sۚ?+6�H";bR����i6�K��̲��i^�r}��ת4���v��_
EaS�K���"R�P`�4T����ڼQ�gA����!8���H�*�婲�.U� ���~��
�2
�>Va����Cl^qFs�<O�$>�ꅧ���hToQ �.���:�n��&�lk��%h]D«���tp��ot�r�B�Y\�4��I�A:��A`c���
�M���Dluu���1��W5�	V-�d����U��o�����!�y�pļ��Gl�mrH퉕���b���YM��:�o4_�2	W�@��YRwҹ��@�����n`��(���!��/�0q�|?��������=R��y^R������l��j[i1�)��3�+�7\��(y�~���B�^���[b�wIFp� �  <6RH����u�|t�#���|��h�e9r�O�/L�s˳c�B�6I9]�㣡�Ŗ]F�Rcvb>d�*�4>�&R���/z��ej)M9�V�nh"��fj��P�㸍~��*�X/�a*��y�D94_̏V� ��Lsv9;�4�]��b�Y���ǎ��z7#��4ck*��^7,a�z��)�#AKS<�&o��А�&W���T>���Gk7�S�l��u�t,}`����}�i>.��n�qj�aԯK�D�N����3������	�,�;��/s;��s`�C��i�5��%4S1������t��1�O͵��L���Z%+��T<B���ޥ:xh����1�_�E������EE%�VM�(Q�kJ�� ���V��w���B9[|H�Tlp��)Lmc���;����?F%5�j{��_7��ubb�l�T�ꍁSZ?]���oi�����YD�Y��N�o���)�[�WV��i�s��oMB99�cn�J�B���͏QH��n��v9�O!s	D�4,t d	ә����h��MT�����2h��ŏY���Rʟ�',�`J]ѮTz,�N8��EvZq?%�:Ѡf�Ye"h��}��o�Q��ɮ�`��ۃ�5�Qn��kjo)�q�SS���~Do��%��%�*?�יR�W��:3<�=ʅzV8�%�����Lh�K$���;?�'>A7��`'ÞU���j\s�/ �ƴ�䱂Ŷ�:�9�~2s��I��ϋp5ˮ�wD�w��0�lIE���\2+F��,-��&~�|--��� m�z7R-"ny��"������tG����>�ޏ*�*��q��<:��4��Vӈh84����ư�sJ@�rS��W�;FM^����_�G8�z����ʢ�̀(F��&kJ��>v�%W��}��.�a_�F� ����H��|�c�u\���,(U�~�Χ�Wu4n���y��"�R	r��e+�r-	�Jս[O`���8���7R���Ζs�o��'�I�C,uj8��Žr8i@-���1���"VD�ݘ	ޠQ�k�i<��4gz)�X�}��{KI�y�$P������w�	�/��a��z��rh�=��J�eN�5
ȳ�X���u�<#�Q�Ի��4%�i�n.6E��kM� ��\�E���5�[gڼ���x�)�D�Ou���w���䁣r-z��z�X�A�7�����]�D ��'T�S3߷K�s2s�l8�1��[o�8x9gP��M�xm_5��P�|<�Ғ�I&Pܡx_�����m��F���̫�4�g�}�-�s:0s���w<5^�̌���l\	X��p1 K�Z)�ޡ|��8�Py��Ğ�S�\�9}|j(G��tZ�5/��G�
��^�u�-~��E4-{�;�e>gЂ����~�a�+����U�5�z�k�����=�u:�n9�OpniE��3uV:e��Ė8����(��W�sZ�F�,o�ּX���5�$��u���Tˬ:nt�#�,��嚿�t_[M��<m��@Po�ʤ��N���彃!����/��e��v�9�U�^$���M�49=����4�P�~�����Y�w%������2�C���޸g�dHZlQ�"�#�4L���V�����:��z0��$[9��L,�,4��6���5ȁ�rݝ����B]Uz���tk\R=���ߢ��L�HJ�P4w�dx��h��B����S�3"~ sN����,�����ׄs����O�d���         
   x���          
   e  x���QO�0����6M�i������dC����u�����`$:}iz���~��N�Q4�p:��u=����:ɍ}�-<&��$�*� GrW+.�F�H,DEY�3�����Ia�%�R�K���6I�}.�+Ciɥ���Y���V[�LH��a$xS}~�	������n�
 N�̤��L0������q�<���m4G�b�oׅEK�>�f�ʚL�]�j�l�$"���F��S�\}חZxL1�Ѽ3��*5%퓊�ι'����Nt�S;8�k�k����Ź5�m]�fM��q��i\�f��K3����|!4SzK7�K�������%[uy�q��> ��+            x��[�vI�}��5/v�����h�S�����H�%��J���ώȢ.wW�̙>/�T**.{�H���T����"=��VoR->���'�m��9>��"�L���/��8���
���x"��`�/���2���_D�������i��G'�x5�?_?\����`*�oG�?�����F\�HG2��A���Z���Ndq�N����Ə*YI�ւ~X�D�D��BK\�g*�O��D�LYfz)��Z.�^ ��-�&I�F�d�K�����zs�^��H��K��u�{o"�$���T����J{k�	�ӵNV�x;0ӟ��ѽa��Dg�����J!z�1W��ʙy1�ӎ��E	$�A�S1ԉ�OR|�t�D�q0>��ٟ�Y(�û�-=Q�Yϕx������E�čά�	���m:jf�iHDL��&B���A�(q��L��A��F/�K2RU*�a�C�s�P�c�ݟb�inAL2���μe'�,;�����D�_��A:92�my��W6s�̭�.XG�(�7M����-WN��\�32�:�e�P������2F�������Mx|���)b�n�'��	�P���ī��ܘA�46���'�|�FJ�H&R)��B�{��|��F���@Q:k��}���YF�n]"�5+ .�p4�Y�p@�g�T! ��_\�@��,���Y��?��V�P�YLH��)i�q��XFb!#6���K<����)�[��K]Lq9o���G>0���<,� %	��ˣE8B���ɹ���̤�C,axJ�<HFR�1��[��q�'���4'cʘ|�WpT�P{\J��حshv�#NYd�B���Ǫ�oE�jp�zN�]�~��gx5�����T�.�0%&3�b��!�d\����z|AM.%>!�؊�lK|�|y�:�-)B�%�\!f:�f��9���]$���~�b>>-0n(S����Ed��|M���JY��9���S����c�i�2gՔ�4QN�X�.�"SF�K������!o�L�W�Z!�q�`�yv�g�Kv�� ��)�g�J��;i�W [�"�.T�B~�T�9�F��bG�5���Q�W�!Ś�UVu��*ykX��*�_�G��Nۙ�+�K�22n!.Yn�*��.�_S�ډ��4F�$p���Z�LB@0�(�U�E���S�}���>�0:Ǜ^;m���rgqL�`s6|�D]�L]�y��x��H4��ذ�:�5>(k9p+�JM�u95ܶ��I<�АPG�Qm��2��hƝΫ`��eA�"ݷ��JpXW�(k�
�#��Ҧ�&�;5=|Mg�;��ؒZ�x�#�>�P��Hv�6�����o2*�CÚ�V񏻒�x�
^��k*Ӫ��*�[� �<�������Y�U���+�w�H]-ᴷ����E�I�O�U3� �Q��X�K��*>�;�ʪ��9C5S���Cf�r/*@喤ۭ���^�e�Ep�W���XDAUR�[D�]n�
�t�l*��R�ģ&Q����T���I�l�W�y�C#���	�� �r��w,-+��A�(��5n�}�{eL���,M��y�s|B�:��ڴ�V�U�k���#\_z�͓y��w�����kc]�x�[)������ؼ�L"}BY�p���4N�(�0W�9��R<'5a�w��M5
bsN��Z�P\�C���U�Zl)qS�mK�nlž(�O���gJi*]��jBƱ�*upc�T�ۅ��S�.c�p&Uo\�+���]!�y�ÝI��� 1,�?Z
]��!�\6�����_��n�����z���f�):�����褕�W�W�$��R򪪉U�exJE�ؤ��"�^�T]�M�Z�N��_k1|�@OH�e��~ p#�7�:uO	q+-T�S.�����7��<4Ep��u0[�k���"�Qi��Z��S������\��HHPt �g�|Q4�̀��F�d�ȁ�5�͐�C��d�Z�襰��pb��o����i�Bk�K��@����Ϫ˸�8��zV	t*���s�-�z���/j����kj�7V�(����qJi��&#o��E�%U(�D3�3�?�ʓ��$-�� !F@ ���v���y��}�E�)b���L璖O��J��"Z���_�4m����5�F@I�	2��'�)w�$�Ҷ6��gn�ZW���	��8��ƥ�Ő��/��ꀚ���٧��l�+Xk)��ψ[YCc�����+ҹr�6���I�{��)��i؞���FLQ�x�j}��>e��ɜ��i����O�6��I�(�ŭ�c�eMf2�Q���GE\���y�#Q����6L�ִ����j"���K�2�Q�+�[P��v���T{�P6W�f��ߎ#���$6���z2��B��M���դkj�hy�ܻ����s�Z�z��Ĥ��( ��C˶c_�E�FW��
8�+1��r�����LR�K(��f��������8�E�����`��������lmE��¦'�Lq�,�wg�7�剂�jZ]�T�
~�}�\��ILk�ΛX��gS�B����3�ǫ�����4�)������>/�G�K [h<�j�x���JaX�r{\�����n"���[IZս�U['`�x���?�fS�4�m�F���2ꃣ�ǒS<x�ogF�,� ��Q��\��&pW�^�V<#yn]�%�޷{�7n8�T�������{t0a�{�<������!^#7i�٥!C��>r��4k���ru���(�+M�a,�<�H��{�y���>w�ǎY����-�K�FB�0G��_�1��;I}��1��{��&o[��ԭ�<->�;�7|1�0����0O �v�!��[��Wڪ99v�[�����+��Ʀ��;��/��?[j����*��% T�<9Ԫ�a�	�I$������z�m�Fz�ت9��/��D$��E-�_�N0K��~��$/~�T��ڍŎ��V���i�Tw-�<�3�L|֩cFO�\t�=�o2��(.�D5ŗ�q��X<��bP��! �Y��%#�[���ڈK�lJ2�`W<����my����m��=k�F��wN[G�6q�CH5?鴲��p[Wj�[��<Bt<�B�B�^�'�@��f�~/�&ԛbm�؄ӿ��hR����zݿ��z��Y�A��g�d� ��,}]�`���s&Q�!��?�v|�Шz�0�	�2�B��*�<���^׭��``��"2k��D����ADѡ�U��Q�<Щ�1�z%w���y�;:<�1�ecE�7X���4V+)��>���ءs���H9�lh� �_�+gX��QBR�jE�M�8���CyJ��x�b�&�6�� ������l����`�$�.�>�x�g�����x75l���e�i���NE�����Ф�R�Rߠ���Ν�-��H�>�|x�ieՁi�+��A�b�Vy�}�:.: ƶ��ǻG��nKD���hٸA��45���������?K�olė�e�5�sudY�[s�g��ŀ9�JPZm��M�}���d�cb� ]�|�r�k���^B���gO���֥<�I��8�-*����6���ik��@���0+�� ���[3D4����W�P���rò O��v�Z����3��򑗏�!6L��x�tbv
8��r���kj�A��� ��'e�� IaU�G���6^��(7��W�ߞ5���RLu�a��؎Mu���h:���+��ZQ C�%KW��Em�xK�����D���;�{K���i�oZ���]�CҲ���\��n��{sD+��9���[{|2�ȃ�v�H�A��}�[:y,~5�r��s`�{3'�k�P�bl��P9�͠��,����.�R�sC3\-�G�4L)�t�]����llb�"��D�s�6ђ�i���z��$u<��*�R�W�4}}GS^1�AJ�x�U�E���&��Z�u�_g�րt~�Q�
��y�Z�&$+<A�~�_! �ϣ �B���[S�e��7�`j�I����~ '��Z�TK��]{���P����9,���}�k� g  ���ޱN��C��f���WO����%�b�ѦߥO�W_P;�um��)�4�[j�׾q��pJ��_��Q��Y�z��9���ľ6����D�?+�t�ht�h>:����B���w#|����������7��@�w��S��ʂP�B�sTy�f�d���'�jA�NO(�Lh�i4�vN��X؉���c�_��|����^�ͬk:���Zq��;Q� �(��t[e_��8��M�^ʏ�����V�~����?!���m|����)�v��;Ś��݇�����ߜ�dl���@��Mr �r)�3��|K�]P#O̩"8�'�� �s�����������-_휜�d�Ǿ���O�!.
     