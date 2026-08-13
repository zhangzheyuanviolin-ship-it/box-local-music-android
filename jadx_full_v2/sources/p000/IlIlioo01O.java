            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            
            public final class IlIlioo01O {
                public static final IlIlioo01O I00000oOI;
                public HashMap I00000oIO;

                static {
/* 3 */             IlIlioo01O ilIlioo01O = new IlIlioo01O();
/* 8 */             HashMap map = new HashMap();
/* 11 */            ilIlioo01O.I00000oIO = map;
/* 16 */            I001l0I00 i001l0I00 = new I001l0I00(5);
/* 22 */            I001l0I00 i001l0I002 = new I001l0I00(4);
/* 28 */            I001l0I00 i001l0I003 = new I001l0I00(2);
/* 34 */            I001l0I00 i001l0I004 = new I001l0I00(6);
/* 40 */            I001l0I00 i001l0I005 = new I001l0I00(0);
/* 46 */            I001l0I00 i001l0I006 = new I001l0I00(1);
/* 52 */            I001l0I00 i001l0I007 = new I001l0I00(7);
/* 58 */            I001l0I00 i001l0I008 = new I001l0I00(3);
/* 63 */            O00OIo0Ill o00OIo0Ill = new O00OIo0Ill();
/* 68 */            map.put(IIi0I0I0o.I01OlOoii0, i001l0I00);
/* 73 */            map.put(IIi0I0I0o.I01Olioli, i001l0I00);
/* 78 */            map.put(IIi0I0I0o.I011lIilI0lo, i001l0I002);
/* 83 */            map.put(IIi0I0I0o.I011lO1liO1O, i001l0I002);
/* 88 */            map.put(IIi0I0I0o.I010I0, i001l0I003);
/* 93 */            map.put(IIi0I0I0o.I010II, i001l0I003);
/* 98 */            map.put(IIi0I0I0o.I01oIilIolOl, i001l0I004);
/* 103 */           map.put(IIi0I0I0o.I01oIoOI01l, i001l0I004);
/* 108 */           map.put(IIi0I0I0o.I00lll10, i001l0I005);
/* 113 */           map.put(IIi0I0I0o.I00o0iI0io1, i001l0I005);
/* 118 */           map.put(IIi0I0I0o.I00o0l1o1o0, i001l0I006);
/* 123 */           map.put(IIi0I0I0o.I00o101lO, i001l0I006);
/* 128 */           map.put(IIi0I0I0o.I0III01lOo, i001l0I007);
/* 133 */           map.put(IIi0I0I0o.I0IIOOO1O, i001l0I007);
/* 138 */           map.put(IIi0I0I0o.I011iIOio, i001l0I008);
/* 143 */           map.put(IIi0I0I0o.I01lOOlO0o, o00OIo0Ill);
/* 146 */           VarHandle.storeStoreFence();
/* 149 */           I00000oOI = ilIlioo01O;
                }

                public final IlIli001 I00000oIO(IIi0I0I0o iIi0I0I0o) throws IOException {
/* 7 */             IlIli001 ilIli001 = (IlIli001) this.I00000oIO.get(iIi0I0I0o);
/* 9 */             if (ilIli001 != null) {
/* 11 */                return ilIli001;
                    }
/* 14 */            IOOlIIilOl0.I000l1("Invalid filter: ", iIi0I0I0o);
/* 17 */            return null;
                }
            }
