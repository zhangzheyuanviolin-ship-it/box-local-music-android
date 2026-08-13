            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O0liI0l {
                public OiIii0 I00000oIO;
                public IloOi11lo I00000oOI;
                public OI10I1IoI0Ol I0000Il00O;

                public final IlliIl1l11O I00000oIO(int i, Object obj, Object obj2) {
/* 1 */             OI10I1IoI0Ol oI10I1IoI0Ol = this.I0000Il00O;
/* 7 */             O0li1O o0li1O = (O0li1O) oI10I1IoI0Ol.I000II(obj);
/* 9 */             if (o0li1O != null && o0li1O.I0000Il00O == i && O0000Ioio00.I0000O(o0li1O.I00000oOI, obj2)) {
/* 23 */                return o0li1O.I00000oIO();
                    }
/* 30 */            O0li1O o0li1O2 = new O0li1O();
/* 33 */            o0li1O2.I0000oI00 = this;
/* 35 */            o0li1O2.I00000oIO = obj;
/* 37 */            o0li1O2.I00000oOI = obj2;
/* 39 */            o0li1O2.I0000Il00O = i;
/* 41 */            VarHandle.storeStoreFence();
/* 44 */            oI10I1IoI0Ol.I000lI(obj, o0li1O2);
/* 47 */            return o0li1O2.I00000oIO();
                }

                public final Object I00000oOI(Object obj) {
/* 1 */             if (obj == null) {
/* 37 */                return null;
                    }
/* 10 */            O0li1O o0li1O = (O0li1O) this.I0000Il00O.I000II(obj);
/* 12 */            if (o0li1O != null) {
/* 14 */                return o0li1O.I00000oOI;
                    }
/* 23 */            O0liilOIOii o0liilOIOii = (O0liilOIOii) this.I00000oOI.invoke();
/* 25 */            int iI0000oI00 = o0liilOIOii.I0000oI00(obj);
/* 30 */            if (iI0000oI00 != -1) {
/* 32 */                return o0liilOIOii.I0000Il00O(iI0000oI00);
                    }
/* 37 */            return null;
                }
            }
