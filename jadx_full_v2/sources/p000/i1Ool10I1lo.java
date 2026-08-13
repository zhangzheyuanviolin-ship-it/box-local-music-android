            package p000;

            import java.io.UnsupportedEncodingException;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            
            public final class i1Ool10I1lo implements i1OOOloIO {
                public l0O11O1I I00000oIO;
                public l0O11O1I I00000oOI;
                public i1OO1io I0000Il00O;

                public static I1l0I1oi I00000oOI(i1OO1io i1oo1io, OoIol00Ool ooIol00Ool) throws UnsupportedEncodingException {
                    byte[] bArrI0000O;
/* 1 */             int i = i1oo1io.I0000Il00O;
/* 3 */             i1O01oOIoI0I i1o01ooioi0i = i1O01oOIoI0I.I00olI;
/* 22 */            ((IIlOoolol0ll) ooIol00Ool.I00iiO).I00l0I0l0lO1 = Boolean.valueOf(1 == (i ^ 1));
/* 26 */            IIlOoolol0ll iIlOoolol0ll = (IIlOoolol0ll) ooIol00Ool.I00iiO;
/* 28 */            Boolean bool = Boolean.FALSE;
/* 30 */            iIlOoolol0ll.getClass();
/* 35 */            o1I01i0iOo o1i01i0ioo = new o1I01i0iOo();
/* 42 */            o1i01i0ioo.I00000oIO = (String) iIlOoolol0ll.I00iiI;
/* 48 */            o1i01i0ioo.I00000oOI = (String) iIlOoolol0ll.I00iiO;
/* 54 */            o1i01i0ioo.I0000Il00O = (String) iIlOoolol0ll.I00iio;
/* 60 */            o1i01i0ioo.I0000O = (String) iIlOoolol0ll.I00ilI0I1;
/* 66 */            o1i01i0ioo.I0000oI00 = (iooO1OIlo) iIlOoolol0ll.I00ilO0;
/* 72 */            o1i01i0ioo.I0001Ioi1lo = (String) iIlOoolol0ll.I00io1l;
/* 74 */            o1i01i0ioo.I000II = bool;
/* 80 */            o1i01i0ioo.I000O01llI0 = (Boolean) iIlOoolol0ll.I00ioIO;
/* 86 */            o1i01i0ioo.I000OOo1O = (Boolean) iIlOoolol0ll.I00l0I0l0lO1;
/* 92 */            o1i01i0ioo.I000OiO = (Integer) iIlOoolol0ll.I00l0OO0IO;
/* 98 */            o1i01i0ioo.I000iOII = (Integer) iIlOoolol0ll.I00li1OI;
/* 100 */           VarHandle.storeStoreFence();
/* 105 */           I1ii1o0 i1ii1o0 = (I1ii1o0) ooIol00Ool.I00iiI;
/* 107 */           i1ii1o0.I00iiI = o1i01i0ioo;
                    try {
/* 109 */               i1i0olI.I0010o();
/* 112 */               if (i == 0) {
/* 114 */                   o01Io111 o01io111I00OIl = i1ii1o0.I00OIl();
/* 120 */                   O01IiIi1l o01IiIi1l = new O01IiIi1l();
/* 123 */                   i1o01ooioi0i.configure(o01IiIi1l);
/* 126 */                   o01IiIi1l.I0000O = true;
/* 138 */                   bArrI0000O = o01IiIi1l.I00000oIO().I000l1(o01io111I00OIl).getBytes("utf-8");
                        } else {
/* 143 */                   o01Io111 o01io111I00OIl2 = i1ii1o0.I00OIl();
/* 150 */                   iilI1lI10Ii iili1li10ii = new iilI1lI10Ii(2);
/* 155 */                   HashMap map = new HashMap();
/* 158 */                   iili1li10ii.I00000oOI = map;
/* 162 */                   HashMap map2 = new HashMap();
/* 165 */                   iili1li10ii.I0000Il00O = map2;
/* 167 */                   l0iO10io0IOO l0io10io0ioo = iilI1lI10Ii.I0001Ioi1lo;
/* 169 */                   VarHandle.storeStoreFence();
/* 172 */                   i1o01ooioi0i.configure(iili1li10ii);
/* 179 */                   HashMap map3 = new HashMap(map);
/* 184 */                   HashMap map4 = new HashMap(map2);
/* 187 */                   l1IllOOOo1 l1illoooo1 = new l1IllOOOo1(0);
/* 190 */                   l1illoooo1.I00iiI = map3;
/* 192 */                   l1illoooo1.I00iiO = map4;
/* 194 */                   l1illoooo1.I00iio = l0io10io0ioo;
/* 196 */                   VarHandle.storeStoreFence();
/* 199 */                   bArrI0000O = l1illoooo1.I0000O(o01io111I00OIl2);
                        }
/* 203 */               return Il10IiOO.I00000oOI(bArrI0000O);
                    } catch (UnsupportedEncodingException e) {
/* 332 */               throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                    }
                }

                @Override
                public final void I00000oIO(OoIol00Ool ooIol00Ool) {
/* 1 */             i1OO1io i1oo1io = this.I0000Il00O;
/* 5 */             if (i1oo1io.I0000Il00O != 0) {
/* 37 */                ((OoIOlll0O) this.I00000oOI.zza()).I00000oIO(I00000oOI(i1oo1io, ooIol00Ool));
/* 77 */                return;
                    }
/* 7 */             l0O11O1I l0o11o1i = this.I00000oIO;
/* 9 */             if (l0o11o1i != null) {
/* 21 */                ((OoIOlll0O) l0o11o1i.zza()).I00000oIO(I00000oOI(i1oo1io, ooIol00Ool));
                    }
                }
            }
