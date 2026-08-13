            package androidx.work;

            import java.util.AbstractCollection;
            import java.util.HashSet;
            import java.util.UUID;
            import java.util.concurrent.ExecutorService;
            import p000.Ii00l101O;
            import p000.Ii11I1OOII1;
            import p000.IliliOoOloi;
            import p000.OOO11l;
            import p000.OlilOlOiI;
            import p000.OloIli;
            import p000.i01i10I1Io1;
            
            public final class WorkerParameters {
                public final UUID I00000oIO;
                public final Ii11I1OOII1 I00000oOI;
                public final HashSet I0000Il00O;
                public final OlilOlOiI I0000O;
                public final int I0000oI00;
                public final ExecutorService I0001Ioi1lo;
                public final Ii00l101O I000II;
                public final OloIli I000O01llI0;
                public final i01i10I1Io1 I000OOo1O;
                public final OOO11l I000OiO;
                public final IliliOoOloi I000iOII;
                public final int I000l1;

                public WorkerParameters(UUID uuid, Ii11I1OOII1 ii11I1OOII1, AbstractCollection abstractCollection, OlilOlOiI olilOlOiI, int i, int i2, ExecutorService executorService, Ii00l101O ii00l101O, OloIli oloIli, i01i10I1Io1 i01i10i1io1, OOO11l oOO11l, IliliOoOloi ililiOoOloi) {
/* 4 */             this.I00000oIO = uuid;
/* 6 */             this.I00000oOI = ii11I1OOII1;
/* 13 */            this.I0000Il00O = new HashSet(abstractCollection);
/* 15 */            this.I0000O = olilOlOiI;
/* 17 */            this.I0000oI00 = i;
/* 19 */            this.I000l1 = i2;
/* 21 */            this.I0001Ioi1lo = executorService;
/* 23 */            this.I000II = ii00l101O;
/* 25 */            this.I000O01llI0 = oloIli;
/* 27 */            this.I000OOo1O = i01i10i1io1;
/* 29 */            this.I000OiO = oOO11l;
/* 31 */            this.I000iOII = ililiOoOloi;
                }
            }
