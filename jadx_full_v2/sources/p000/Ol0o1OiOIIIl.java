            package p000;

            import android.content.Context;
            import android.net.Uri;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOl0o1OiOIIIl;", "LOooioIIoi0O;", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class Ol0o1OiOIIIl extends OooioIIoi0O {
                public Ii1liIllli0 I00000oOI;
                public Context I0000Il00O;
                public OlO0OIIl1 I0000O;
                public OOli1O I0000oI00;
                public boolean I0001Ioi1lo;

                public static OIoi0IIoi I0001Ioi1lo(Ol0o1OiOIIIl ol0o1OiOIIIl, String str, boolean z, String str2, String str3, int i) {
/* 9 */             String str4 = (i & 8) != 0 ? "" : str2;
/* 17 */            String str5 = (i & 16) != 0 ? "" : str3;
/* 19 */            ol0o1OiOIIIl.getClass();
/* 31 */            List listI00IoIO0lI = OlOoOIi0o.I00IoIO0lI(str, new String[]{"---"}, 6);
/* 37 */            ArrayList arrayList = new ArrayList();
/* 46 */            if (listI00IoIO0lI.size() < 3) {
/* 50 */                arrayList.add("Invalid format: Expected at least two '---' sections.");
/* 55 */                return new OIoi0IIoi(null, arrayList);
                    }
/* 78 */            Iterator it = OlOoOIi0o.I00II0Ol1O0l(OlOoOIi0o.I00OIo((String) listI00IoIO0lI.get(1)).toString()).iterator();
/* 3 */             String string = "";
/* 84 */            String string2 = null;
/* 85 */            String string3 = null;
/* 86 */            String string4 = null;
/* 87 */            boolean z2 = false;
/* 88 */            boolean z3 = false;
/* 93 */            while (it.hasNext()) {
/* 105 */               String string5 = OlOoOIi0o.I00OIo((String) it.next()).toString();
/* 115 */               if (O0000Ioio00.I0000O(string5, "metadata:")) {
/* 118 */                   z2 = true;
                        } else if (z2) {
/* 171 */                   if (OlOolloIIOl0.I000l1(string5, "require-secret:", false)) {
/* 185 */                       z3 = Boolean.parseBoolean(OlOoOIi0o.I00OIo(OlOoOIi0o.I00Iooi00oi(string5, "require-secret:", string5)).toString());
                            } else if (OlOolloIIOl0.I000l1(string5, "require-secret-description:", false)) {
/* 206 */                       string = OlOoOIi0o.I00OIo(OlOoOIi0o.I00Iooi00oi(string5, "require-secret-description:", string5)).toString();
                            } else if (OlOolloIIOl0.I000l1(string5, "homepage:", false)) {
/* 227 */                       string4 = OlOoOIi0o.I00OIo(OlOoOIi0o.I00Iooi00oi(string5, "homepage:", string5)).toString();
                            }
                        } else if (OlOolloIIOl0.I000l1(string5, "name:", false)) {
/* 138 */                   string2 = OlOoOIi0o.I00OIo(OlOoOIi0o.I00Iooi00oi(string5, "name:", string5)).toString();
                        } else if (OlOolloIIOl0.I000l1(string5, "description:", false)) {
/* 160 */                   string3 = OlOoOIi0o.I00OIo(OlOoOIi0o.I00Iooi00oi(string5, "description:", string5)).toString();
                        }
                    }
/* 232 */           if (string2 == null || string2.length() == 0) {
/* 242 */               arrayList.add("Missing or empty 'name' in the header.");
                    }
/* 245 */           if (string3 == null || string3.length() == 0) {
/* 255 */               arrayList.add("Missing or empty 'description' in the header.");
                    }
/* 286 */           String string6 = OlOoOIi0o.I00OIo(IOOi0Ool1i.I00IlilI0i0i(IOOi0Ool1i.I001iOo1i0O(listI00IoIO0lI, 2), "---", null, null, null, 62)).toString();
/* 294 */           if (!arrayList.isEmpty()) {
/* 298 */               return new OIoi0IIoi(null, arrayList);
                    }
/* 302 */           Ol0ilO ol0ilOI001lllioOl = Ol0ioI1iI.I001lllioOl();
/* 306 */           ol0ilOI001lllioOl.I0000O();
/* 313 */           ((Ol0ioI1iI) ol0ilOI001lllioOl.I00iiI).I00IOO(string2);
/* 316 */           ol0ilOI001lllioOl.I0000O();
/* 323 */           ((Ol0ioI1iI) ol0ilOI001lllioOl.I00iiI).I00II0Ol1O0l(string3);
/* 326 */           ol0ilOI001lllioOl.I0000O();
/* 333 */           ((Ol0ioI1iI) ol0ilOI001lllioOl.I00iiI).I00IO1oi11O(string6);
/* 336 */           ol0ilOI001lllioOl.I0000O();
/* 345 */           ((Ol0ioI1iI) ol0ilOI001lllioOl.I00iiI).I001lloI(z);
/* 349 */           ol0ilOI001lllioOl.I000II(true);
/* 352 */           ol0ilOI001lllioOl.I0000O();
/* 359 */           ((Ol0ioI1iI) ol0ilOI001lllioOl.I00iiI).I00Io1o110i(str4);
/* 362 */           ol0ilOI001lllioOl.I0000O();
/* 369 */           ((Ol0ioI1iI) ol0ilOI001lllioOl.I00iiI).I00IioO0OiOi(z3);
/* 372 */           ol0ilOI001lllioOl.I0000O();
/* 379 */           ((Ol0ioI1iI) ol0ilOI001lllioOl.I00iiI).I00IlilI0i0i(string);
/* 3 */             String str6 = string4 != null ? string4 : "";
/* 386 */           ol0ilOI001lllioOl.I0000O();
/* 393 */           ((Ol0ioI1iI) ol0ilOI001lllioOl.I00iiI).I00II0oii1o(str6);
/* 396 */           ol0ilOI001lllioOl.I0000O();
/* 403 */           ((Ol0ioI1iI) ol0ilOI001lllioOl.I00iiI).I00IO1(str5);
/* 416 */           return new OIoi0IIoi((Ol0ioI1iI) ol0ilOI001lllioOl.I00000oOI(), Il01100l.I00iOIl);
                }

                public final void I0000oI00(Ol0ioI1iI ol0ioI1iI) {
                    Object value;
                    ArrayList arrayListI00OI1;
                    Ol0loOOoo ol0loOOooI00000oIO;
/* 1 */             ol0ioI1iI.toString();
/* 4 */             OlO0OIIl1 olO0OIIl1 = this.I0000O;
/* 119 */           do {
/* 6 */                 value = olO0OIIl1.getValue();
/* 11 */                Ol0loOOoo ol0loOOoo = (Ol0loOOoo) value;
/* 15 */                Ol0oI1llIloI ol0oI1llIloI = new Ol0oI1llIloI(ol0ioI1iI);
/* 22 */                if (ol0ioI1iI.I0010I0i()) {
/* 41 */                    ol0loOOooI00000oIO = Ol0loOOoo.I00000oIO(ol0loOOoo, false, IOOi0Ool1i.I00OI1(ol0loOOoo.I00000oOI, ol0oI1llIloI), false, null, null, false, null, null, 253);
                        } else {
/* 48 */                    Iterator it = ol0loOOoo.I00000oOI.iterator();
/* 52 */                    int i = 0;
                            while (true) {
/* 58 */                        if (!it.hasNext()) {
/* 78 */                            i = -1;
                                    break;
                                } else if (!((Ol0oI1llIloI) it.next()).I00000oIO.I0010I0i()) {
                                    break;
                                } else {
/* 75 */                            i++;
                                }
                            }
/* 79 */                    List list = ol0loOOoo.I00000oOI;
/* 81 */                    if (i == -1) {
/* 85 */                        arrayListI00OI1 = IOOi0Ool1i.I00OI1(list, ol0oI1llIloI);
                            } else {
/* 95 */                        ArrayList arrayList = new ArrayList(list);
/* 98 */                        arrayList.add(i, ol0oI1llIloI);
/* 101 */                       arrayListI00OI1 = arrayList;
                            }
/* 111 */                   ol0loOOooI00000oIO = Ol0loOOoo.I00000oIO(ol0loOOoo, false, arrayListI00OI1, false, null, null, false, null, null, 253);
                        }
/* 119 */           } while (!olO0OIIl1.I000iOII(value, ol0loOOooI00000oIO));
/* 121 */           IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(this);
/* 125 */           IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 137 */           iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new Ol0Oli(this, ol0ioI1iI, (IOoil1iiIilo) null, 3), 2);
                }

                public final void I000II(String str) {
                    Object next;
                    Object value;
                    Ol0loOOoo ol0loOOoo;
                    ArrayList arrayList;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000O;
/* 13 */            Iterator it = ((Ol0loOOoo) olO0OIIl1.getValue()).I00000oOI.iterator();
                    while (true) {
/* 22 */                if (it.hasNext()) {
/* 24 */                    next = it.next();
/* 41 */                    if (O0000Ioio00.I0000O(((Ol0oI1llIloI) next).I00000oIO.I001i1O0Ol(), str)) {
                                break;
                            }
                        } else {
/* 44 */                    next = null;
                            break;
                        }
                    }
/* 45 */            Ol0oI1llIloI ol0oI1llIloI = (Ol0oI1llIloI) next;
/* 52 */            Ol0ioI1iI ol0ioI1iI = ol0oI1llIloI != null ? ol0oI1llIloI.I00000oIO : null;
/* 53 */            if (ol0ioI1iI == null) {
/* 55 */                return;
                    }
/* 122 */           do {
/* 56 */                value = olO0OIIl1.getValue();
/* 61 */                ol0loOOoo = (Ol0loOOoo) value;
/* 63 */                List list = ol0loOOoo.I00000oOI;
/* 69 */                arrayList = new ArrayList();
/* 80 */                for (Object obj : list) {
/* 99 */                    if (!O0000Ioio00.I0000O(((Ol0oI1llIloI) obj).I00000oIO.I001i1O0Ol(), str)) {
/* 101 */                       arrayList.add(obj);
                            }
                        }
/* 122 */           } while (!olO0OIIl1.I000iOII(value, Ol0loOOoo.I00000oIO(ol0loOOoo, false, arrayList, false, null, null, false, null, null, 253)));
/* 124 */           IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(this);
/* 128 */           IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 138 */           iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new Ol0o0I01iIO(ol0ioI1iI, this, str, (IOoil1iiIilo) null), 2);
                }

                public final String I000O01llI0(String str, String str2) {
/* 1 */             Ol0ioI1iI ol0ioI1iII000l1 = I000l1(str);
/* 5 */             if (ol0ioI1iII000l1 == null) {
/* 52 */                return null;
                    }
/* 44 */            String strI000o00OoI0I = ol0ioI1iII000l1.I001IIilI0O().length() > 0 ? IIl001iO0Io.I000o00OoI0I("https://appassets.androidplatform.net/", ol0ioI1iII000l1.I001IIilI0O()) : ol0ioI1iII000l1.I001lIiIIo1O().length() > 0 ? ol0ioI1iII000l1.I001lIiIIo1O() : "";
/* 50 */            if (strI000o00OoI0I.length() == 0) {
/* 52 */                return null;
                    }
/* 56 */            return IlIi0I0.I000lI(strI000o00OoI0I, "/scripts/", str2);
                }

                public final String I000OOo1O(String str, String str2) {
/* 1 */             Ol0ioI1iI ol0ioI1iII000l1 = I000l1(str);
/* 5 */             if (ol0ioI1iII000l1 != null && !OlOolloIIOl0.I000l1(str2, "http", false)) {
/* 54 */                String strI000o00OoI0I = ol0ioI1iII000l1.I001IIilI0O().length() > 0 ? IIl001iO0Io.I000o00OoI0I("https://appassets.androidplatform.net/", ol0ioI1iII000l1.I001IIilI0O()) : ol0ioI1iII000l1.I001lIiIIo1O().length() > 0 ? ol0ioI1iII000l1.I001lIiIIo1O() : "";
/* 60 */                if (strI000o00OoI0I.length() != 0) {
/* 65 */                    return IlIi0I0.I000lI(strI000o00OoI0I, "/assets/", str2);
                        }
                    }
/* 62 */            return str2;
                }

                public final ArrayList I000OiO() {
/* 9 */             List list = ((Ol0loOOoo) this.I0000O.getValue()).I00000oOI;
/* 15 */            ArrayList arrayList = new ArrayList();
/* 26 */            for (Object obj : list) {
/* 41 */                if (((Ol0oI1llIloI) obj).I00000oIO.I001l0I00()) {
/* 43 */                    arrayList.add(obj);
                        }
                    }
/* 55 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 58 */            Iterator it = arrayList.iterator();
/* 66 */            while (it.hasNext()) {
/* 76 */                arrayList2.add(((Ol0oI1llIloI) it.next()).I00000oIO);
                    }
/* 110 */           return arrayList2;
                }

                public final String I000iOII() {
/* 18 */            return IOOi0Ool1i.I00IlilI0i0i(I000OiO(), "\n", null, null, new OiioI1Io0o(9), 30);
                }

                public final Ol0ioI1iI I000l1(String str) {
                    Object next;
/* 13 */            Iterator it = ((Ol0loOOoo) this.I0000O.getValue()).I00000oOI.iterator();
                    while (true) {
/* 22 */                if (!it.hasNext()) {
/* 44 */                    next = null;
                            break;
                        }
/* 24 */                next = it.next();
/* 41 */                if (O0000Ioio00.I0000O(((Ol0oI1llIloI) next).I00000oIO.I001i1O0Ol(), str)) {
                            break;
                        }
                    }
/* 45 */            Ol0oI1llIloI ol0oI1llIloI = (Ol0oI1llIloI) next;
/* 47 */            if (ol0oI1llIloI != null) {
/* 49 */                return ol0oI1llIloI.I00000oIO;
                    }
/* 21 */            return null;
                }

                public final void I000lI(boolean z) {
                    Object value;
                    Ol0loOOoo ol0loOOoo;
                    ArrayList arrayList;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000O;
/* 84 */            do {
/* 3 */                 value = olO0OIIl1.getValue();
/* 8 */                 ol0loOOoo = (Ol0loOOoo) value;
/* 10 */                List list = ol0loOOoo.I00000oOI;
/* 22 */                arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 25 */                Iterator it = list.iterator();
/* 33 */                while (it.hasNext()) {
/* 49 */                    Ol0ilO ol0ilO = (Ol0ilO) ((Ol0oI1llIloI) it.next()).I00000oIO.I00100o1O0lo();
/* 51 */                    ol0ilO.I000II(z);
/* 63 */                    arrayList.add(new Ol0oI1llIloI((Ol0ioI1iI) ol0ilO.I00000oOI()));
                        }
/* 84 */            } while (!olO0OIIl1.I000iOII(value, Ol0loOOoo.I00000oIO(ol0loOOoo, false, arrayList, false, null, null, false, null, null, 253)));
/* 86 */            IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(this);
/* 90 */            IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 101 */           iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new I1oo01II0O11(this, z, (IOoil1iiIilo) null), 2);
                }

                public final void I000o00OoI0I(Uri uri) {
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000O;
                    while (true) {
/* 3 */                 Object value = olO0OIIl1.getValue();
/* 19 */                Uri uri2 = uri;
/* 28 */                if (olO0OIIl1.I000iOII(value, Ol0loOOoo.I00000oIO((Ol0loOOoo) value, false, null, false, null, uri2, false, null, null, 239))) {
/* 30 */                    return;
                        } else {
/* 31 */                    uri = uri2;
                        }
                    }
                }

                public final void I000oI1ioi(Ol0oI1llIloI ol0oI1llIloI, boolean z) {
                    Object value;
/* 7 */             Ol0ioI1iI ol0ioI1iI = ol0oI1llIloI.I00000oIO;
/* 13 */            Ol0ilO ol0ilO = (Ol0ilO) ol0ioI1iI.I00100o1O0lo();
/* 15 */            ol0ilO.I000II(z);
/* 22 */            Ol0ioI1iI ol0ioI1iI2 = (Ol0ioI1iI) ol0ilO.I00000oOI();
/* 24 */            OlO0OIIl1 olO0OIIl1 = this.I0000O;
/* 32 */            List<Ol0oI1llIloI> list = ((Ol0loOOoo) olO0OIIl1.getValue()).I00000oOI;
/* 44 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 55 */            for (Ol0oI1llIloI ol0oI1llIloI2 : list) {
/* 77 */                if (O0000Ioio00.I0000O(ol0oI1llIloI2.I00000oIO.I001i1O0Ol(), ol0ioI1iI.I001i1O0Ol())) {
/* 81 */                    ol0oI1llIloI2 = new Ol0oI1llIloI(ol0ioI1iI2);
                        }
/* 84 */                arrayList.add(ol0oI1llIloI2);
                    }
/* 112 */           do {
/* 88 */                value = olO0OIIl1.getValue();
/* 112 */           } while (!olO0OIIl1.I000iOII(value, Ol0loOOoo.I00000oIO((Ol0loOOoo) value, false, arrayList, false, null, null, false, null, null, 253)));
/* 114 */           IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(this);
/* 118 */           IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 129 */           iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new Ii1li0iio0i(this, ol0oI1llIloI, z, null), 2);
                }

                public final void I00100l0(boolean z) {
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000O;
                    while (true) {
/* 3 */                 Object value = olO0OIIl1.getValue();
/* 19 */                boolean z2 = z;
/* 28 */                if (olO0OIIl1.I000iOII(value, Ol0loOOoo.I00000oIO((Ol0loOOoo) value, false, null, z2, null, null, false, null, null, 251))) {
/* 30 */                    return;
                        } else {
/* 31 */                    z = z2;
                        }
                    }
                }

                public final void I00100o1O0lo(String str) {
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000O;
                    while (true) {
/* 3 */                 Object value = olO0OIIl1.getValue();
/* 19 */                String str2 = str;
/* 28 */                if (olO0OIIl1.I000iOII(value, Ol0loOOoo.I00000oIO((Ol0loOOoo) value, false, null, false, str2, null, false, null, null, 247))) {
/* 30 */                    return;
                        } else {
/* 31 */                    str = str2;
                        }
                    }
                }

                public final void I0010I0i(IllOOo00lI illOOo00lI, Function1 function1) {
/* 2 */             I00100l0(true);
/* 6 */             I00100o1O0lo(null);
/* 17 */            Uri uri = ((Ol0loOOoo) this.I0000O.getValue()).I0000oI00;
/* 19 */            if (uri == null) {
/* 22 */                I00100l0(false);
/* 27 */                I00100o1O0lo("No directory URI set.");
/* 30 */                function1.invoke("No directory URI set.");
                    } else {
/* 34 */                IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(this);
/* 38 */                IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 52 */                iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new I0O0Ooi10l(uri, this, function1, illOOo00lI, null), 2);
                    }
                }

                public final void I0010o(IllOOo00lI illOOo00lI, String str, Function1 function1) {
/* 2 */             I00100l0(true);
/* 6 */             I00100o1O0lo(null);
/* 9 */             IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(this);
/* 13 */            IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 28 */            iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new II01IloII(str, this, function1, illOOo00lI, (IOoil1iiIilo) null), 2);
                }
            }
