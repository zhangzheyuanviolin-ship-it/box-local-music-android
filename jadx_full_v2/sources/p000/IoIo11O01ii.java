            package p000;
            
            public abstract class IoIo11O01ii {
                public static final I1OoollI1Il1 I00000oIO;

                static {
                    O0O01O0o o0O01O0oI00000oIO;
/* 5 */             O0IOli0o0 o0IOli0o0I00000oOI = OOoOl0i.I00000oIO.I00000oOI(IOlOl10.class);
                    try {
/* 9 */                 o0O01O0oI00000oIO = OOoOl0i.I00000oIO(IOlOl10.class);
                    } catch (Throwable unused) {
/* 14 */                o0O01O0oI00000oIO = null;
                    }
/* 27 */            I00000oIO = new I1OoollI1Il1("ApplicationPluginRegistry", new OoOO010(o0IOli0o0I00000oOI, o0O01O0oI00000oIO));
                }

                public static final Object I00000oIO(IoIlI1oli ioIlI1oli, IoIo10lOo1 ioIo10lOo1) {
/* 9 */             IOlOl10 iOlOl10 = (IOlOl10) ioIlI1oli.I00ioIO.I0000O(I00000oIO);
/* 22 */            Object objI0000O = iOlOl10 != null ? iOlOl10.I0000O(ioIo10lOo1.getKey()) : null;
/* 23 */            if (objI0000O != null) {
/* 25 */                return objI0000O;
                    }
/* 32 */            StringBuilder sb = new StringBuilder("Plugin ");
/* 35 */            sb.append(ioIo10lOo1);
/* 38 */            I1OoollI1Il1 key = ioIo10lOo1.getKey();
/* 44 */            sb.append(" is not installed. Consider using `install(");
/* 47 */            sb.append(key);
/* 52 */            sb.append(")` in client config first.");
/* 89 */            throw new IllegalStateException(sb.toString());
                }
            }
