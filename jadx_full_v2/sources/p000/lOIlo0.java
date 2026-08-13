            package p000;

            import java.io.UnsupportedEncodingException;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            
            public final class lOIlo0 implements lO100lOl01 {
                public O0ioIo1O0lO I00000oIO;
                public O0ioIo1O0lO I00000oOI;
                public lO0ioo11llOO I0000Il00O;

                public static I1l0I1oi I00000oOI(lO0ioo11llOO lo0ioo11lloo, OoIOol ooIOol) throws UnsupportedEncodingException {
                    byte[] bArrI00000oIO;
/* 1 */             int i = lo0ioo11lloo.I0000Il00O;
/* 3 */             iOloo0O0O ioloo0o0o = iOloo0O0O.I00l0I0l0lO1;
/* 7 */             l1Il1IliOI1l l1il1ilioi1l = (l1Il1IliOI1l) ooIOol.I00iiI;
/* 25 */            ((IIlOoolol0ll) ooIOol.I00iiO).I00l0I0l0lO1 = Boolean.valueOf(1 == (i ^ 1));
/* 29 */            IIlOoolol0ll iIlOoolol0ll = (IIlOoolol0ll) ooIOol.I00iiO;
/* 31 */            Boolean bool = Boolean.FALSE;
/* 33 */            iIlOoolol0ll.getClass();
/* 38 */            lIi00i lii00i = new lIi00i();
/* 45 */            lii00i.I00000oIO = (String) iIlOoolol0ll.I00iiI;
/* 51 */            lii00i.I00000oOI = (String) iIlOoolol0ll.I00iiO;
/* 57 */            lii00i.I0000Il00O = (String) iIlOoolol0ll.I00iio;
/* 63 */            lii00i.I0000O = (String) iIlOoolol0ll.I00ilI0I1;
/* 69 */            lii00i.I0000oI00 = (loll11I) iIlOoolol0ll.I00ilO0;
/* 75 */            lii00i.I0001Ioi1lo = (String) iIlOoolol0ll.I00io1l;
/* 77 */            lii00i.I000II = bool;
/* 83 */            lii00i.I000O01llI0 = (Boolean) iIlOoolol0ll.I00ioIO;
/* 89 */            lii00i.I000OOo1O = (Boolean) iIlOoolol0ll.I00l0I0l0lO1;
/* 95 */            lii00i.I000OiO = (Integer) iIlOoolol0ll.I00l0OO0IO;
/* 101 */           lii00i.I000iOII = (Integer) iIlOoolol0ll.I00li1OI;
/* 103 */           VarHandle.storeStoreFence();
/* 106 */           l1il1ilioi1l.I00iOIl = lii00i;
                    try {
/* 108 */               lOOlOoll.I0000O();
/* 111 */               if (i == 0) {
/* 113 */                   l1Ioi1ioOI l1ioi1iooiI000II = l1il1ilioi1l.I000II();
/* 119 */                   O01IiIi1l o01IiIi1l = new O01IiIi1l();
/* 122 */                   ioloo0o0o.configure(o01IiIi1l);
/* 125 */                   o01IiIi1l.I0000O = true;
/* 137 */                   bArrI00000oIO = o01IiIi1l.I00000oIO().I000l1(l1ioi1iooiI000II).getBytes("utf-8");
                        } else {
/* 142 */                   l1Ioi1ioOI l1ioi1iooiI000II2 = l1il1ilioi1l.I000II();
/* 149 */                   iilI1lI10Ii iili1li10ii = new iilI1lI10Ii(3);
/* 154 */                   HashMap map = new HashMap();
/* 157 */                   iili1li10ii.I00000oOI = map;
/* 161 */                   HashMap map2 = new HashMap();
/* 164 */                   iili1li10ii.I0000Il00O = map2;
/* 166 */                   iIOo0oiIi1 iioo0oiii1 = iIOo0oiIi1.I0000oI00;
/* 168 */                   VarHandle.storeStoreFence();
/* 171 */                   ioloo0o0o.configure(iili1li10ii);
/* 178 */                   HashMap map3 = new HashMap(map);
/* 183 */                   HashMap map4 = new HashMap(map2);
/* 186 */                   iIolll0O iiolll0o = new iIolll0O();
/* 189 */                   iiolll0o.I00000oIO = map3;
/* 191 */                   iiolll0o.I00000oOI = map4;
/* 193 */                   iiolll0o.I0000Il00O = iioo0oiii1;
/* 195 */                   VarHandle.storeStoreFence();
/* 198 */                   bArrI00000oIO = iiolll0o.I00000oIO(l1ioi1iooiI000II2);
                        }
/* 202 */               return Il10IiOO.I00000oOI(bArrI00000oIO);
                    } catch (UnsupportedEncodingException e) {
/* 332 */               throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                    }
                }

                @Override
                public final void I00000oIO(OoIOol ooIOol) {
/* 1 */             lO0ioo11llOO lo0ioo11lloo = this.I0000Il00O;
/* 5 */             if (lo0ioo11lloo.I0000Il00O != 0) {
/* 37 */                ((OoIOlll0O) this.I00000oOI.get()).I00000oIO(I00000oOI(lo0ioo11lloo, ooIOol));
/* 77 */                return;
                    }
/* 7 */             O0ioIo1O0lO o0ioIo1O0lO = this.I00000oIO;
/* 9 */             if (o0ioIo1O0lO != null) {
/* 21 */                ((OoIOlll0O) o0ioIo1O0lO.get()).I00000oIO(I00000oOI(lo0ioo11lloo, ooIOol));
                    }
                }
            }
