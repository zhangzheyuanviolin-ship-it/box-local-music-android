            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class ii0l1l {
                public OillOo0 I00000oIO;

                public static int I00000oIO(OillOo0 oillOo0, Object obj, Object obj2) {
/* 3 */             ii10iIl ii10iil = (ii10iIl) oillOo0.I00iiI;
/* 7 */             ii10iIl ii10iil2 = (ii10iIl) oillOo0.I00iio;
/* 19 */            return ii0O1Ol1i.I00000oIO(ii10iil2, 2, obj2) + ii0O1Ol1i.I00000oIO(ii10iil, 1, obj);
                }

                public static ii0l1l I00000oOI(ii10iIl ii10iil, Object obj, ii10iIl ii10iil2, Object obj2) {
/* 3 */             ii0l1l ii0l1lVar = new ii0l1l();
/* 10 */            OillOo0 oillOo0 = new OillOo0(19);
/* 13 */            oillOo0.I00iiI = ii10iil;
/* 15 */            oillOo0.I00iiO = obj;
/* 17 */            oillOo0.I00iio = ii10iil2;
/* 19 */            oillOo0.I00ilI0I1 = obj2;
/* 21 */            VarHandle.storeStoreFence();
/* 24 */            ii0l1lVar.I00000oIO = oillOo0;
/* 26 */            VarHandle.storeStoreFence();
/* 204 */           return ii0l1lVar;
                }

                public static void I0000Il00O(ii0I1Il ii0i1il, OillOo0 oillOo0, Object obj, Object obj2) {
/* 6 */             ii0O1Ol1i.I0000oI00(ii0i1il, (ii10iIl) oillOo0.I00iiI, 1, obj);
/* 14 */            ii0O1Ol1i.I0000oI00(ii0i1il, (ii10iIl) oillOo0.I00iio, 2, obj2);
                }
            }
