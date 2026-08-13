            package p000;

            import java.io.UnsupportedEncodingException;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            
            public final class i1Iooo0O implements o1I00lIo1oi {
                public l0O11O1I I00000oIO;
                public l0O11O1I I00000oOI;
                public o11oO0Oo I0000Il00O;

                public static I1l0I1oi I00000oOI(o11oO0Oo o11oo0oo, OoOlO1O0o ooOlO1O0o) throws UnsupportedEncodingException {
                    byte[] bArrI001IO000;
/* 1 */             int i = o11oo0oo.I0000Il00O;
/* 3 */             O1oO0lOoI1 o1oO0lOoI1 = O1oO0lOoI1.I00ioIO;
/* 21 */            ((IIlOoolol0ll) ooOlO1O0o.I00iiO).I00l0I0l0lO1 = Boolean.valueOf(1 == (i ^ 1));
/* 25 */            IIlOoolol0ll iIlOoolol0ll = (IIlOoolol0ll) ooOlO1O0o.I00iiO;
/* 27 */            Boolean bool = Boolean.FALSE;
/* 29 */            iIlOoolol0ll.getClass();
/* 34 */            o10iloO1l1 o10iloo1l1 = new o10iloO1l1();
/* 41 */            o10iloo1l1.I00000oIO = (String) iIlOoolol0ll.I00iiI;
/* 47 */            o10iloo1l1.I00000oOI = (String) iIlOoolol0ll.I00iiO;
/* 53 */            o10iloo1l1.I0000Il00O = (String) iIlOoolol0ll.I00iio;
/* 59 */            o10iloo1l1.I0000O = (String) iIlOoolol0ll.I00ilI0I1;
/* 65 */            o10iloo1l1.I0000oI00 = (ioI01O0) iIlOoolol0ll.I00ilO0;
/* 71 */            o10iloo1l1.I0001Ioi1lo = (String) iIlOoolol0ll.I00io1l;
/* 73 */            o10iloo1l1.I000II = bool;
/* 79 */            o10iloo1l1.I000O01llI0 = (Boolean) iIlOoolol0ll.I00ioIO;
/* 85 */            o10iloo1l1.I000OOo1O = (Boolean) iIlOoolol0ll.I00l0I0l0lO1;
/* 91 */            o10iloo1l1.I000OiO = (Integer) iIlOoolol0ll.I00l0OO0IO;
/* 97 */            o10iloo1l1.I000iOII = (Integer) iIlOoolol0ll.I00li1OI;
/* 99 */            VarHandle.storeStoreFence();
/* 104 */           I1ii1o0 i1ii1o0 = (I1ii1o0) ooOlO1O0o.I00iiI;
/* 106 */           i1ii1o0.I00iiI = o10iloo1l1;
                    try {
/* 108 */               i1O10l1io1iO.I000o00OoI0I();
/* 111 */               if (i == 0) {
/* 113 */                   loo1OOo1O loo1ooo1oI00OIO1 = i1ii1o0.I00OIO1();
/* 119 */                   O01IiIi1l o01IiIi1l = new O01IiIi1l();
/* 122 */                   o1oO0lOoI1.configure(o01IiIi1l);
/* 125 */                   o01IiIi1l.I0000O = true;
/* 137 */                   bArrI001IO000 = o01IiIi1l.I00000oIO().I000l1(loo1ooo1oI00OIO1).getBytes("utf-8");
                        } else {
/* 142 */                   loo1OOo1O loo1ooo1oI00OIO12 = i1ii1o0.I00OIO1();
/* 149 */                   iiIolOO000 iiioloo000 = new iiIolOO000(2);
/* 154 */                   HashMap map = new HashMap();
/* 157 */                   iiioloo000.I00000oOI = map;
/* 161 */                   HashMap map2 = new HashMap();
/* 164 */                   iiioloo000.I0000Il00O = map2;
/* 166 */                   l0iO10io0IOO l0io10io0ioo = iiIolOO000.I0001Ioi1lo;
/* 168 */                   VarHandle.storeStoreFence();
/* 171 */                   o1oO0lOoI1.configure(iiioloo000);
/* 178 */                   HashMap map3 = new HashMap(map);
/* 183 */                   HashMap map4 = new HashMap(map2);
/* 188 */                   Oo1ol1ll oo1ol1ll = new Oo1ol1ll(29);
/* 191 */                   oo1ol1ll.I00iiI = map3;
/* 193 */                   oo1ol1ll.I00iiO = map4;
/* 195 */                   oo1ol1ll.I00iio = l0io10io0ioo;
/* 197 */                   VarHandle.storeStoreFence();
/* 200 */                   bArrI001IO000 = oo1ol1ll.I001IO000(loo1ooo1oI00OIO12);
                        }
/* 204 */               return Il10IiOO.I00000oOI(bArrI001IO000);
                    } catch (UnsupportedEncodingException e) {
/* 332 */               throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                    }
                }

                @Override
                public final void I00000oIO(OoOlO1O0o ooOlO1O0o) {
/* 1 */             o11oO0Oo o11oo0oo = this.I0000Il00O;
/* 5 */             if (o11oo0oo.I0000Il00O != 0) {
/* 37 */                ((OoIOlll0O) this.I00000oOI.zza()).I00000oIO(I00000oOI(o11oo0oo, ooOlO1O0o));
/* 77 */                return;
                    }
/* 7 */             l0O11O1I l0o11o1i = this.I00000oIO;
/* 9 */             if (l0o11o1i != null) {
/* 21 */                ((OoIOlll0O) l0o11o1i.zza()).I00000oIO(I00000oOI(o11oo0oo, ooOlO1O0o));
                    }
                }
            }
