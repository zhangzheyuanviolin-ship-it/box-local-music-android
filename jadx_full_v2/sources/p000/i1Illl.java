            package p000;

            import java.io.UnsupportedEncodingException;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            
            public final class i1Illl implements o11loliol0 {
                public l0O11O1I I00000oIO;
                public l0O11O1I I00000oOI;
                public o11io11I I0000Il00O;

                public static I1l0I1oi I00000oOI(o11io11I o11io11i, i000IO i000io) throws UnsupportedEncodingException {
                    byte[] bArrI001IIilI0O;
/* 1 */             int i = o11io11i.I0000Il00O;
/* 3 */             Iioi0lilII iioi0lilII = Iioi0lilII.I00l0I0l0lO1;
/* 21 */            ((IIlOoolol0ll) i000io.I00iiO).I00l0I0l0lO1 = Boolean.valueOf(1 == (i ^ 1));
/* 25 */            IIlOoolol0ll iIlOoolol0ll = (IIlOoolol0ll) i000io.I00iiO;
/* 27 */            Boolean bool = Boolean.FALSE;
/* 29 */            iIlOoolol0ll.getClass();
/* 34 */            o10Oo0i o10oo0i = new o10Oo0i();
/* 41 */            o10oo0i.I00000oIO = (String) iIlOoolol0ll.I00iiI;
/* 47 */            o10oo0i.I00000oOI = (String) iIlOoolol0ll.I00iiO;
/* 53 */            o10oo0i.I0000Il00O = (String) iIlOoolol0ll.I00iio;
/* 59 */            o10oo0i.I0000O = (String) iIlOoolol0ll.I00ilI0I1;
/* 65 */            o10oo0i.I0000oI00 = (io1O1ooo) iIlOoolol0ll.I00ilO0;
/* 71 */            o10oo0i.I0001Ioi1lo = (String) iIlOoolol0ll.I00io1l;
/* 73 */            o10oo0i.I000II = bool;
/* 79 */            o10oo0i.I000O01llI0 = (Boolean) iIlOoolol0ll.I00ioIO;
/* 85 */            o10oo0i.I000OOo1O = (Boolean) iIlOoolol0ll.I00l0I0l0lO1;
/* 91 */            o10oo0i.I000OiO = (Integer) iIlOoolol0ll.I00l0OO0IO;
/* 97 */            o10oo0i.I000iOII = (Integer) iIlOoolol0ll.I00li1OI;
/* 99 */            VarHandle.storeStoreFence();
/* 104 */           I1ii1o0 i1ii1o0 = (I1ii1o0) i000io.I00iiI;
/* 106 */           i1ii1o0.I00iiI = o10oo0i;
                    try {
/* 108 */               i1O01Ill.I000OOo1O();
/* 111 */               if (i == 0) {
/* 113 */                   loo0IIIOooii loo0iiioooiiI00O10llo = i1ii1o0.I00O10llo();
/* 119 */                   O01IiIi1l o01IiIi1l = new O01IiIi1l();
/* 122 */                   iioi0lilII.configure(o01IiIi1l);
/* 125 */                   o01IiIi1l.I0000O = true;
/* 137 */                   bArrI001IIilI0O = o01IiIi1l.I00000oIO().I000l1(loo0iiioooiiI00O10llo).getBytes("utf-8");
                        } else {
/* 142 */                   loo0IIIOooii loo0iiioooiiI00O10llo2 = i1ii1o0.I00O10llo();
/* 148 */                   iio0oIll1 iio0oill1 = new iio0oIll1(1);
/* 153 */                   HashMap map = new HashMap();
/* 156 */                   iio0oill1.I00000oOI = map;
/* 160 */                   HashMap map2 = new HashMap();
/* 163 */                   iio0oill1.I0000Il00O = map2;
/* 165 */                   l0iO10io0IOO l0io10io0ioo = iio0oIll1.I0000oI00;
/* 167 */                   VarHandle.storeStoreFence();
/* 170 */                   iioi0lilII.configure(iio0oill1);
/* 177 */                   HashMap map3 = new HashMap(map);
/* 182 */                   HashMap map4 = new HashMap(map2);
/* 187 */                   Oo1ol1ll oo1ol1ll = new Oo1ol1ll(28);
/* 190 */                   oo1ol1ll.I00iiI = map3;
/* 192 */                   oo1ol1ll.I00iiO = map4;
/* 194 */                   oo1ol1ll.I00iio = l0io10io0ioo;
/* 196 */                   VarHandle.storeStoreFence();
/* 199 */                   bArrI001IIilI0O = oo1ol1ll.I001IIilI0O(loo0iiioooiiI00O10llo2);
                        }
/* 203 */               return Il10IiOO.I00000oOI(bArrI001IIilI0O);
                    } catch (UnsupportedEncodingException e) {
/* 332 */               throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                    }
                }

                @Override
                public final void I00000oIO(i000IO i000io) {
/* 1 */             o11io11I o11io11i = this.I0000Il00O;
/* 5 */             if (o11io11i.I0000Il00O != 0) {
/* 37 */                ((OoIOlll0O) this.I00000oOI.zza()).I00000oIO(I00000oOI(o11io11i, i000io));
/* 77 */                return;
                    }
/* 7 */             l0O11O1I l0o11o1i = this.I00000oIO;
/* 9 */             if (l0o11o1i != null) {
/* 21 */                ((OoIOlll0O) l0o11o1i.zza()).I00000oIO(I00000oOI(o11io11i, i000io));
                    }
                }
            }
