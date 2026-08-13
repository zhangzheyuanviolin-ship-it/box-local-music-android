            package p000;

            import java.util.LinkedHashMap;
            import java.util.Map;
            
/* 10 */    public final class OOllli10 extends O1Il00 {
                public final int I000II = 0;
                public final Object I000O01llI0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OOllli10(l0l1ol11 l0l1ol11Var) {
/* 8 */             super(20);
/* 4 */             this.I000O01llI0 = l0l1ol11Var;
                }

                @Override
                public Object I00000oIO(Object obj) throws Throwable {
                    LinkedHashMap linkedHashMap;
                    switch (this.I000II) {
                        case 1:
/* 11 */                    String str = (String) obj;
/* 13 */                    lII0I0I000I.I0000O(str);
/* 18 */                    l0l1ol11 l0l1ol11Var = (l0l1ol11) this.I000O01llI0;
/* 20 */                    l0l1ol11Var.I010OIo1l();
/* 23 */                    lII0I0I000I.I0000O(str);
/* 28 */                    iOl1lOo1IO iol1loo1io = l0l1ol11Var.I00iiI.I00iiO;
/* 30 */                    lilOOl0.I00O0o1oo(iol1loo1io);
/* 33 */                    Oo1ol1ll oo1ol1llI01OoIoio00O = iol1loo1io.I01OoIoio00O(str);
/* 37 */                    if (oo1ol1llI01OoIoio00O == null) {
/* 39 */                        return null;
                            }
/* 45 */                    l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) l0l1ol11Var.I00iOIl).I00ilO0;
/* 47 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 54 */                    l01o0io1ooo0.I00lll10.I0000Il00O("Populate EES config from database on cache miss. appId", str);
/* 65 */                    l0l1ol11Var.I010lI0oi(str, l0l1ol11Var.I010o0o0oO(str, (byte[]) oo1ol1llI01OoIoio00O.I00iiI));
/* 68 */                    OOllli10 oOllli10 = l0l1ol11Var.I00li1OI;
                            synchronized (oOllli10.I0000Il00O) {
/* 87 */                        linkedHashMap = new LinkedHashMap(oOllli10.I00000oOI.I00000oIO.entrySet().size());
/* 108 */                       for (Map.Entry entry : oOllli10.I00000oOI.I00000oIO.entrySet()) {
/* 124 */                           linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
/* 135 */                   return (iil1iIlO) linkedHashMap.get(str);
                        default:
/* 6 */                     return super.I00000oIO(obj);
                    }
                }

                @Override
                public void I00000oOI(Object obj, Object obj2, Object obj3) {
                    switch (this.I000II) {
                        case 0:
/* 9 */                     OOlllIo0 oOlllIo0 = (OOlllIo0) obj2;
/* 27 */                    ((O1I1OO) ((OlOO1i11110) this.I000O01llI0).I00iiI).I00111O((O1il00oooo) obj, oOlllIo0.I00000oIO, oOlllIo0.I00000oOI, oOlllIo0.I0000Il00O);
                            break;
                    }
                }

                @Override
                public int I000II(Object obj, Object obj2) {
                    switch (this.I000II) {
                        case 0:
/* 15 */                    return ((OOlllIo0) obj2).I0000Il00O;
                        default:
/* 6 */                     return super.I000II(obj, obj2);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 11 */        public OOllli10(int i, OlOO1i11110 olOO1i11110) {
/* 12 */            super(i);
                    this.I000O01llI0 = olOO1i11110;
                }
            }
