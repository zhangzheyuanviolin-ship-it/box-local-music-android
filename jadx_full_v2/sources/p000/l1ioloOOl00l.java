            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class l1ioloOOl00l {
                /* JADX WARN: Multi-variable type inference failed */
                public static final void I00000oIO(O1ooOo o1ooOo, IllOOo00lI illOOo00lI) {
/* 1 */             OIOili0 oIOili0 = o1ooOo.I00io1l;
/* 3 */             if (oIOili0 == null) {
/* 10 */                oIOili0 = new OIOili0();
/* 13 */                oIOili0.I00iOIl = (OIOilOIi1) o1ooOo;
/* 15 */                VarHandle.storeStoreFence();
/* 18 */                o1ooOo.I00io1l = oIOili0;
                    }
/* 26 */            OIlOIi0 snapshotObserver = ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(o1ooOo)).getSnapshotObserver();
/* 34 */            snapshotObserver.I00000oIO.I0000oI00(oIOili0, OIOili0.I00iiI, illOOo00lI);
                }
            }
