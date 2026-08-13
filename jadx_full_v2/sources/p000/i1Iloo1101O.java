            package p000;

            import java.io.UnsupportedEncodingException;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            
            public final class i1Iloo1101O implements o11o0i0oO {
                public l0O11O1I I00000oIO;
                public l0O11O1I I00000oOI;
                public o11l1o0I I0000Il00O;

                public static I1l0I1oi I00000oOI(o11l1o0I o11l1o0i, OoIOol ooIOol) throws UnsupportedEncodingException {
                    byte[] bArrI001l0I00;
/* 1 */             int i = o11l1o0i.I0000Il00O;
/* 3 */             Io1Oioii1111 io1Oioii1111 = Io1Oioii1111.I00ioIO;
/* 21 */            ((IIlOoolol0ll) ooIOol.I00iiO).I00l0I0l0lO1 = Boolean.valueOf(1 == (i ^ 1));
/* 25 */            IIlOoolol0ll iIlOoolol0ll = (IIlOoolol0ll) ooIOol.I00iiO;
/* 27 */            Boolean bool = Boolean.FALSE;
/* 29 */            iIlOoolol0ll.getClass();
/* 34 */            o10OoiIiIII o10ooiiiiii = new o10OoiIiIII();
/* 41 */            o10ooiiiiii.I00000oIO = (String) iIlOoolol0ll.I00iiI;
/* 47 */            o10ooiiiiii.I00000oOI = (String) iIlOoolol0ll.I00iiO;
/* 53 */            o10ooiiiiii.I0000Il00O = (String) iIlOoolol0ll.I00iio;
/* 59 */            o10ooiiiiii.I0000O = (String) iIlOoolol0ll.I00ilI0I1;
/* 65 */            o10ooiiiiii.I0000oI00 = (io1OIiI1olo) iIlOoolol0ll.I00ilO0;
/* 71 */            o10ooiiiiii.I0001Ioi1lo = (String) iIlOoolol0ll.I00io1l;
/* 73 */            o10ooiiiiii.I000II = bool;
/* 79 */            o10ooiiiiii.I000O01llI0 = (Boolean) iIlOoolol0ll.I00ioIO;
/* 85 */            o10ooiiiiii.I000OOo1O = (Boolean) iIlOoolol0ll.I00l0I0l0lO1;
/* 91 */            o10ooiiiiii.I000OiO = (Integer) iIlOoolol0ll.I00l0OO0IO;
/* 97 */            o10ooiiiiii.I000iOII = (Integer) iIlOoolol0ll.I00li1OI;
/* 99 */            VarHandle.storeStoreFence();
/* 104 */           I1ii1o0 i1ii1o0 = (I1ii1o0) ooIOol.I00iiI;
/* 106 */           i1ii1o0.I00iiI = o10ooiiiiii;
                    try {
/* 108 */               i1O01oOIoI0I.I000l1();
/* 111 */               if (i == 0) {
/* 113 */                   loo0IlI1li loo0ili1liI00OI1 = i1ii1o0.I00OI1();
/* 119 */                   O01IiIi1l o01IiIi1l = new O01IiIi1l();
/* 122 */                   io1Oioii1111.configure(o01IiIi1l);
/* 125 */                   o01IiIi1l.I0000O = true;
/* 137 */                   bArrI001l0I00 = o01IiIi1l.I00000oIO().I000l1(loo0ili1liI00OI1).getBytes("utf-8");
                        } else {
/* 142 */                   loo0IlI1li loo0ili1liI00OI12 = i1ii1o0.I00OI1();
/* 148 */                   il00IloliiI il00iloliii = new il00IloliiI(1);
/* 153 */                   HashMap map = new HashMap();
/* 156 */                   il00iloliii.I00000oOI = map;
/* 160 */                   HashMap map2 = new HashMap();
/* 163 */                   il00iloliii.I0000Il00O = map2;
/* 165 */                   l0iO10io0IOO l0io10io0ioo = il00IloliiI.I0000oI00;
/* 167 */                   VarHandle.storeStoreFence();
/* 170 */                   io1Oioii1111.configure(il00iloliii);
/* 177 */                   HashMap map3 = new HashMap(map);
/* 182 */                   HashMap map4 = new HashMap(map2);
/* 187 */                   OlilOlOiI olilOlOiI = new OlilOlOiI(29);
/* 190 */                   olilOlOiI.I00iiI = map3;
/* 192 */                   olilOlOiI.I00iiO = map4;
/* 194 */                   olilOlOiI.I00iio = l0io10io0ioo;
/* 196 */                   VarHandle.storeStoreFence();
/* 199 */                   bArrI001l0I00 = olilOlOiI.I001l0I00(loo0ili1liI00OI12);
                        }
/* 203 */               return Il10IiOO.I00000oOI(bArrI001l0I00);
                    } catch (UnsupportedEncodingException e) {
/* 332 */               throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                    }
                }

                @Override
                public final void I00000oIO(OoIOol ooIOol) {
/* 1 */             o11l1o0I o11l1o0i = this.I0000Il00O;
/* 5 */             if (o11l1o0i.I0000Il00O != 0) {
/* 37 */                ((OoIOlll0O) this.I00000oOI.zza()).I00000oIO(I00000oOI(o11l1o0i, ooIOol));
/* 77 */                return;
                    }
/* 7 */             l0O11O1I l0o11o1i = this.I00000oIO;
/* 9 */             if (l0o11o1i != null) {
/* 21 */                ((OoIOlll0O) l0o11o1i.zza()).I00000oIO(I00000oOI(o11l1o0i, ooIOol));
                    }
                }
            }
