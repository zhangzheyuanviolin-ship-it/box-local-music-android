            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public final class OlloIi1Ilil extends I00io1l {
                public OlloIi1 I00000oIO;
                public ArrayList I00000oOI;
                public ArrayList I0000Il00O;
                public boolean I0000O;

                public static ArrayList I000iOII(OlII0Io1 olII0Io1) {
/* 1 */             CharSequence charSequence = olII0Io1.I00000oIO;
/* 8 */             int iI0000O = l1oOoi1ooIi.I0000O(charSequence, 0, charSequence.length());
/* 12 */            int length = charSequence.length();
/* 22 */            if (charSequence.charAt(iI0000O) == '|') {
/* 24 */                iI0000O++;
/* 36 */                length = l1oOoi1ooIi.I0000oI00(charSequence, charSequence.length() - 1, iI0000O) + 1;
                    }
/* 40 */            ArrayList arrayList = new ArrayList();
/* 45 */            StringBuilder sb = new StringBuilder();
/* 48 */            int i = iI0000O;
/* 49 */            while (iI0000O < length) {
/* 51 */                char cCharAt = charSequence.charAt(iI0000O);
/* 57 */                if (cCharAt == '\\') {
/* 88 */                    int i2 = iI0000O + 1;
/* 90 */                    if (i2 >= length || charSequence.charAt(i2) != '|') {
/* 103 */                       sb.append('\\');
                            } else {
/* 98 */                        sb.append('|');
/* 101 */                       iI0000O = i2;
                            }
                        } else if (cCharAt != '|') {
/* 61 */                    sb.append(cCharAt);
                        } else {
/* 79 */                    arrayList.add(OlII0Io1.I00000oIO(sb.toString(), olII0Io1.I00000oOI(i, iI0000O).I00000oOI));
/* 82 */                    sb.setLength(0);
/* 85 */                    i = iI0000O + 1;
                        }
/* 106 */               iI0000O++;
                    }
/* 113 */           if (sb.length() > 0) {
/* 135 */               arrayList.add(OlII0Io1.I00000oIO(sb.toString(), olII0Io1.I00000oOI(i, olII0Io1.I00000oIO.length()).I00000oOI));
                    }
/* 186 */           return arrayList;
                }

                @Override
                public final void I00000oIO(OlII0Io1 olII0Io1) {
/* 3 */             this.I00000oOI.add(olII0Io1);
                }

                @Override
                public final boolean I0000O() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final II0oOIlio0 I0001Ioi1lo() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final void I000O01llI0(IollOIOOI00 iollOIOOI00) {
/* 1 */             ArrayList arrayList = this.I00000oOI;
/* 3 */             OlloIi1 olloIi1 = this.I00000oIO;
/* 5 */             List listI0000O = olloIi1.I0000O();
/* 24 */            OlIIOI0o olIIOI0o = !listI0000O.isEmpty() ? (OlIIOI0o) listI0000O.get(0) : null;
/* 27 */            Ollooii0 ollooii0 = new Ollooii0();
/* 30 */            if (olIIOI0o != null) {
/* 32 */                ollooii0.I00000oOI(olIIOI0o);
                    }
/* 35 */            olloIi1.I0000Il00O(ollooii0);
/* 40 */            Olo0ii1lOl00 olo0ii1lOl00 = new Olo0ii1lOl00();
/* 47 */            olo0ii1lOl00.I000II(ollooii0.I0000O());
/* 50 */            ollooii0.I0000Il00O(olo0ii1lOl00);
/* 59 */            ArrayList arrayListI000iOII = I000iOII((OlII0Io1) arrayList.get(0));
/* 63 */            int size = arrayListI000iOII.size();
/* 68 */            for (int i = 0; i < size; i++) {
/* 76 */                Ollooi0 ollooi0I000OiO = I000OiO((OlII0Io1) arrayListI000iOII.get(i), i, iollOIOOI00);
/* 81 */                ollooi0I000OiO.I000II = true;
/* 83 */                olo0ii1lOl00.I0000Il00O(ollooi0I000OiO);
                    }
/* 89 */            int i2 = 2;
/* 90 */            OlloO1O olloO1O = null;
/* 95 */            while (i2 < arrayList.size()) {
/* 101 */               OlII0Io1 olII0Io1 = (OlII0Io1) arrayList.get(i2);
/* 116 */               OlIIOI0o olIIOI0o2 = i2 < listI0000O.size() ? (OlIIOI0o) listI0000O.get(i2) : null;
/* 117 */               ArrayList arrayListI000iOII2 = I000iOII(olII0Io1);
/* 123 */               Olo0ii1lOl00 olo0ii1lOl002 = new Olo0ii1lOl00();
/* 126 */               if (olIIOI0o2 != null) {
/* 128 */                   olo0ii1lOl002.I00000oOI(olIIOI0o2);
                        }
/* 131 */               int i3 = 0;
/* 132 */               while (i3 < size) {
/* 157 */                   olo0ii1lOl002.I0000Il00O(I000OiO(i3 < arrayListI000iOII2.size() ? (OlII0Io1) arrayListI000iOII2.get(i3) : OlII0Io1.I00000oIO("", null), i3, iollOIOOI00));
/* 160 */                   i3++;
                        }
/* 163 */               if (olloO1O == null) {
/* 167 */                   olloO1O = new OlloO1O();
/* 170 */                   olloIi1.I0000Il00O(olloO1O);
                        }
/* 173 */               olloO1O.I0000Il00O(olo0ii1lOl002);
/* 176 */               olloO1O.I00000oOI(olIIOI0o2);
/* 179 */               i2++;
                    }
                }

                @Override
                public final II0oOO1 I000OOo1O(IiiliIioo0oi iiiliIioo0oi) {
/* 3 */             CharSequence charSequence = iiiliIioo0oi.I00000oIO.I00000oIO;
/* 9 */             int iI00000oIO = l1oOoi1ooIi.I00000oIO('|', charSequence, iiiliIioo0oi.I0001Ioi1lo);
/* 15 */            if (iI00000oIO == -1) {
/* 14 */                return null;
                    }
/* 19 */            if (iI00000oIO != iiiliIioo0oi.I0001Ioi1lo || l1oOoi1ooIi.I0000O(charSequence, iI00000oIO + 1, charSequence.length()) != charSequence.length()) {
/* 43 */                return II0oOO1.I00000oIO(iiiliIioo0oi.I0000Il00O);
                    }
/* 38 */            this.I0000O = false;
/* 14 */            return null;
                }

                public final Ollooi0 I000OiO(OlII0Io1 olII0Io1, int i, IollOIOOI00 iollOIOOI00) {
/* 1 */             ArrayList arrayList = this.I0000Il00O;
/* 5 */             Ollooi0 ollooi0 = new Ollooi0();
/* 8 */             OlIIOI0o olIIOI0o = olII0Io1.I00000oOI;
/* 10 */            if (olIIOI0o != null) {
/* 12 */                ollooi0.I00000oOI(olIIOI0o);
                    }
/* 19 */            if (i < arrayList.size()) {
/* 27 */                ollooi0.I000O01llI0 = (OllolO0olOOO) arrayList.get(i);
                    }
/* 29 */            CharSequence charSequence = olII0Io1.I00000oIO;
/* 36 */            int iI0000O = l1oOoi1ooIi.I0000O(charSequence, 0, charSequence.length());
/* 52 */            OlII0Io1 olII0Io1I00000oOI = olII0Io1.I00000oOI(iI0000O, l1oOoi1ooIi.I0000oI00(charSequence, charSequence.length() - 1, iI0000O) + 1);
/* 58 */            OlII11110Iol olII11110Iol = new OlII11110Iol();
/* 63 */            olII11110Iol.I00iOIl.add(olII0Io1I00000oOI);
/* 66 */            iollOIOOI00.I0000oI00(olII11110Iol, ollooi0);
/* 215 */           return ollooi0;
                }
            }
