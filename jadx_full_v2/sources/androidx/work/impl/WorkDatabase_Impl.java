            package androidx.work.impl;

            import androidx.work.impl.model.DependencyDao;
            import androidx.work.impl.model.PreferenceDao;
            import androidx.work.impl.model.RawWorkInfoDao;
            import androidx.work.impl.model.SystemIdInfoDao;
            import androidx.work.impl.model.WorkNameDao;
            import androidx.work.impl.model.WorkProgressDao;
            import androidx.work.impl.model.WorkSpecDao;
            import androidx.work.impl.model.WorkTagDao;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Set;
            import kotlin.Metadata;
            import p000.II1oIiIOOo;
            import p000.IIIOlol;
            import p000.IOO0o0I1l;
            import p000.IioliO10l;
            import p000.Il01100l;
            import p000.O00IOI11;
            import p000.O0IOli0o0;
            import p000.O1loO1i0IoO;
            import p000.OOoOl0i;
            import p000.OOoOl1001II;
            import p000.OllO00oiil;
            import p000.i01I0o;
            import p000.i01I1lO0Ollo;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/WorkDatabase_Impl;", "Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "work-runtime_release"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class WorkDatabase_Impl extends WorkDatabase {
                public final OllO00oiil I000l1;
                public final OllO00oiil I000lI;
                public final OllO00oiil I000o00OoI0I;
                public final OllO00oiil I000oI1ioi;
                public final OllO00oiil I00100l0;
                public final OllO00oiil I00100o1O0lo;
                public final OllO00oiil I0010I0i;
                public final OllO00oiil I0010o;

                public WorkDatabase_Impl() {
/* 7 */             i01I1lO0Ollo i01i1lo0ollo = new i01I1lO0Ollo(0);
/* 10 */            i01i1lo0ollo.I00iiI = this;
/* 12 */            VarHandle.storeStoreFence();
/* 20 */            this.I000l1 = new OllO00oiil(i01i1lo0ollo);
/* 25 */            i01I1lO0Ollo i01i1lo0ollo2 = new i01I1lO0Ollo(1);
/* 28 */            i01i1lo0ollo2.I00iiI = this;
/* 30 */            VarHandle.storeStoreFence();
/* 38 */            this.I000lI = new OllO00oiil(i01i1lo0ollo2);
/* 43 */            i01I1lO0Ollo i01i1lo0ollo3 = new i01I1lO0Ollo(2);
/* 46 */            i01i1lo0ollo3.I00iiI = this;
/* 48 */            VarHandle.storeStoreFence();
/* 56 */            this.I000o00OoI0I = new OllO00oiil(i01i1lo0ollo3);
/* 61 */            i01I1lO0Ollo i01i1lo0ollo4 = new i01I1lO0Ollo(3);
/* 64 */            i01i1lo0ollo4.I00iiI = this;
/* 66 */            VarHandle.storeStoreFence();
/* 74 */            this.I000oI1ioi = new OllO00oiil(i01i1lo0ollo4);
/* 79 */            i01I1lO0Ollo i01i1lo0ollo5 = new i01I1lO0Ollo(4);
/* 82 */            i01i1lo0ollo5.I00iiI = this;
/* 84 */            VarHandle.storeStoreFence();
/* 92 */            this.I00100l0 = new OllO00oiil(i01i1lo0ollo5);
/* 97 */            i01I1lO0Ollo i01i1lo0ollo6 = new i01I1lO0Ollo(5);
/* 100 */           i01i1lo0ollo6.I00iiI = this;
/* 102 */           VarHandle.storeStoreFence();
/* 110 */           this.I00100o1O0lo = new OllO00oiil(i01i1lo0ollo6);
/* 115 */           i01I1lO0Ollo i01i1lo0ollo7 = new i01I1lO0Ollo(6);
/* 118 */           i01i1lo0ollo7.I00iiI = this;
/* 120 */           VarHandle.storeStoreFence();
/* 128 */           this.I0010I0i = new OllO00oiil(i01i1lo0ollo7);
/* 133 */           i01I1lO0Ollo i01i1lo0ollo8 = new i01I1lO0Ollo(7);
/* 136 */           i01i1lo0ollo8.I00iiI = this;
/* 138 */           VarHandle.storeStoreFence();
/* 146 */           this.I0010o = new OllO00oiil(i01i1lo0ollo8);
                }

                @Override
                public final List I0000Il00O(LinkedHashMap linkedHashMap) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 15 */            arrayList.add(new O1loO1i0IoO(13, 14, 14));
/* 23 */            i01I0o i01i0o = new i01I0o(14, 15, 0);
/* 33 */            i01i0o.I0000O = new IIIOlol(9);
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            arrayList.add(i01i0o);
/* 50 */            arrayList.add(new O1loO1i0IoO(16, 17, 15));
/* 60 */            arrayList.add(new O1loO1i0IoO(17, 18, 16));
/* 70 */            arrayList.add(new O1loO1i0IoO(18, 19, 17));
/* 78 */            i01I0o i01i0o2 = new i01I0o(19, 20, 1);
/* 86 */            i01i0o2.I0000O = new IOO0o0I1l(9);
/* 88 */            VarHandle.storeStoreFence();
/* 91 */            arrayList.add(i01i0o2);
/* 101 */           arrayList.add(new O1loO1i0IoO(20, 21, 18));
/* 113 */           arrayList.add(new O1loO1i0IoO(22, 23, 19));
/* 123 */           arrayList.add(new O1loO1i0IoO(23, 24, 20));
/* 168 */           return arrayList;
                }

                @Override
                public final O00IOI11 I0000O() {
/* 31 */            return new O00IOI11(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
                }

                @Override
                public final IioliO10l I0000oI00() {
/* 3 */             return new II1oIiIOOo(this);
                }

                @Override
                public final Set I000OOo1O() {
/* 3 */             return new LinkedHashSet();
                }

                @Override
                public final LinkedHashMap I000OiO() {
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 6 */             OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 10 */            O0IOli0o0 o0IOli0o0I00000oOI = oOoOl1001II.I00000oOI(WorkSpecDao.class);
/* 14 */            Il01100l il01100l = Il01100l.I00iOIl;
/* 16 */            linkedHashMap.put(o0IOli0o0I00000oOI, il01100l);
/* 25 */            linkedHashMap.put(oOoOl1001II.I00000oOI(DependencyDao.class), il01100l);
/* 34 */            linkedHashMap.put(oOoOl1001II.I00000oOI(WorkTagDao.class), il01100l);
/* 43 */            linkedHashMap.put(oOoOl1001II.I00000oOI(SystemIdInfoDao.class), il01100l);
/* 52 */            linkedHashMap.put(oOoOl1001II.I00000oOI(WorkNameDao.class), il01100l);
/* 61 */            linkedHashMap.put(oOoOl1001II.I00000oOI(WorkProgressDao.class), il01100l);
/* 70 */            linkedHashMap.put(oOoOl1001II.I00000oOI(PreferenceDao.class), il01100l);
/* 79 */            linkedHashMap.put(oOoOl1001II.I00000oOI(RawWorkInfoDao.class), il01100l);
/* 110 */           return linkedHashMap;
                }

                @Override
                public final DependencyDao I001IIilI0O() {
/* 7 */             return (DependencyDao) this.I000lI.getValue();
                }

                @Override
                public final PreferenceDao I001IO000() {
/* 7 */             return (PreferenceDao) this.I0010I0i.getValue();
                }

                @Override
                public final RawWorkInfoDao I001i1O0Ol() {
/* 7 */             return (RawWorkInfoDao) this.I0010o.getValue();
                }

                @Override
                public final SystemIdInfoDao I001i1lo1io() {
/* 7 */             return (SystemIdInfoDao) this.I000oI1ioi.getValue();
                }

                @Override
                public final WorkNameDao I001iOo1i0O() {
/* 7 */             return (WorkNameDao) this.I00100l0.getValue();
                }

                @Override
                public final WorkProgressDao I001l0I00() {
/* 7 */             return (WorkProgressDao) this.I00100o1O0lo.getValue();
                }

                @Override
                public final WorkSpecDao I001lIiIIo1O() {
/* 7 */             return (WorkSpecDao) this.I000l1.getValue();
                }

                @Override
                public final WorkTagDao I001lllioOl() {
/* 7 */             return (WorkTagDao) this.I000o00OoI0I.getValue();
                }
            }
