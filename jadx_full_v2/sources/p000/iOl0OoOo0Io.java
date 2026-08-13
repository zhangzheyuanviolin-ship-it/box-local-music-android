            package p000;

            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.nio.charset.StandardCharsets;
            import java.util.HashMap;
            
            public final class iOl0OoOo0Io implements iOilOl01lo0 {
                public l0O11O1I I00000oIO;
                public l0O11O1I I00000oOI;
                public iOilOIiI I0000Il00O;

                public static I1l0I1oi I00000oOI(iOilOIiI ioiloiii, OoIOol ooIOol) {
                    byte[] byteArray;
                    ll0iI0i ll0ii0i;
                    OIOi0lOI oIOi0lOI;
/* 1 */             int i = ioiloiii.I0000Il00O;
/* 3 */             i1O01Ill i1o01ill = i1O01Ill.I00l0I0l0lO1;
/* 22 */            ((IIlOoolol0ll) ooIOol.I00iiO).I00l0I0l0lO1 = Boolean.valueOf(1 == (i ^ 1));
/* 26 */            IIlOoolol0ll iIlOoolol0ll = (IIlOoolol0ll) ooIOol.I00iiO;
/* 28 */            Boolean bool = Boolean.FALSE;
/* 30 */            iIlOoolol0ll.getClass();
/* 35 */            iOOlIOiOl ioolioiol = new iOOlIOiOl();
/* 42 */            ioolioiol.I00000oIO = (String) iIlOoolol0ll.I00iiI;
/* 48 */            ioolioiol.I00000oOI = (String) iIlOoolol0ll.I00iiO;
/* 54 */            ioolioiol.I0000Il00O = (String) iIlOoolol0ll.I00iio;
/* 60 */            ioolioiol.I0000O = (String) iIlOoolol0ll.I00ilI0I1;
/* 66 */            ioolioiol.I0000oI00 = (lOl10OOloi) iIlOoolol0ll.I00ilO0;
/* 72 */            ioolioiol.I0001Ioi1lo = (String) iIlOoolol0ll.I00io1l;
/* 74 */            ioolioiol.I000II = bool;
/* 80 */            ioolioiol.I000O01llI0 = (Boolean) iIlOoolol0ll.I00ioIO;
/* 86 */            ioolioiol.I000OOo1O = (Boolean) iIlOoolol0ll.I00l0I0l0lO1;
/* 92 */            ioolioiol.I000OiO = (Integer) iIlOoolol0ll.I00l0OO0IO;
/* 98 */            ioolioiol.I000iOII = (Integer) iIlOoolol0ll.I00li1OI;
/* 100 */           VarHandle.storeStoreFence();
/* 105 */           I0Oi111ii i0Oi111ii = (I0Oi111ii) ooIOol.I00iiI;
/* 107 */           i0Oi111ii.I00iiI = ioolioiol;
/* 109 */           iOl0lOIi11.I00111O();
/* 112 */           if (i == 0) {
/* 114 */               iO0O0li111 io0o0li111I00OIO1 = i0Oi111ii.I00OIO1();
/* 120 */               O01IiIi1l o01IiIi1l = new O01IiIi1l();
/* 123 */               i1o01ill.configure(o01IiIi1l);
/* 126 */               o01IiIi1l.I0000O = true;
/* 138 */               byteArray = o01IiIi1l.I00000oIO().I000l1(io0o0li111I00OIO1).getBytes(StandardCharsets.UTF_8);
                    } else {
/* 143 */               iO0O0li111 io0o0li111I00OIO12 = i0Oi111ii.I00OIO1();
/* 150 */               iilI1lI10Ii iili1li10ii = new iilI1lI10Ii(5);
/* 155 */               HashMap map = new HashMap();
/* 158 */               iili1li10ii.I00000oOI = map;
/* 162 */               HashMap map2 = new HashMap();
/* 165 */               iili1li10ii.I0000Il00O = map2;
/* 167 */               l0iO10io0IOO l0io10io0ioo = l0iO10io0IOO.I0000Il00O;
/* 169 */               VarHandle.storeStoreFence();
/* 172 */               i1o01ill.configure(iili1li10ii);
/* 177 */               HashMap map3 = new HashMap(map);
/* 182 */               HashMap map4 = new HashMap(map2);
/* 187 */               ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
/* 192 */                   ll0ii0i = new ll0iI0i();
/* 199 */                   OOiI1O oOiI1O = new OOiI1O(15);
/* 202 */                   oOiI1O.I00000oOI = false;
/* 204 */                   oOiI1O.I0000Il00O = false;
/* 206 */                   oOiI1O.I0000oI00 = ll0ii0i;
/* 208 */                   VarHandle.storeStoreFence();
/* 211 */                   ll0ii0i.I0000oI00 = oOiI1O;
/* 213 */                   ll0ii0i.I00000oIO = byteArrayOutputStream;
/* 215 */                   ll0ii0i.I00000oOI = map3;
/* 217 */                   ll0ii0i.I0000Il00O = map4;
/* 219 */                   ll0ii0i.I0000O = l0io10io0ioo;
/* 221 */                   VarHandle.storeStoreFence();
/* 230 */                   oIOi0lOI = (OIOi0lOI) map3.get(iO0O0li111.class);
                        } catch (IOException unused) {
                        }
/* 232 */               if (oIOi0lOI == null) {
/* 253 */                   throw new Il0IO001iOOo("No encoder for ".concat(String.valueOf(iO0O0li111.class)));
                        }
/* 234 */               oIOi0lOI.encode(io0o0li111I00OIO12, ll0ii0i);
/* 254 */               byteArray = byteArrayOutputStream.toByteArray();
                    }
/* 258 */           return Il10IiOO.I00000oOI(byteArray);
                }

                @Override
                public final void I00000oIO(OoIOol ooIOol) {
/* 1 */             iOilOIiI ioiloiii = this.I0000Il00O;
/* 5 */             if (ioiloiii.I0000Il00O != 0) {
/* 37 */                ((OoIOlll0O) this.I00000oOI.zza()).I00000oIO(I00000oOI(ioiloiii, ooIOol));
/* 77 */                return;
                    }
/* 7 */             l0O11O1I l0o11o1i = this.I00000oIO;
/* 9 */             if (l0o11o1i != null) {
/* 21 */                ((OoIOlll0O) l0o11o1i.zza()).I00000oIO(I00000oOI(ioiloiii, ooIOol));
                    }
                }
            }
