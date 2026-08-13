            package p000;

            import android.text.TextUtils;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            
            public final class i01I0IOOI10 {
                public static final String I000OiO = IIi0oIl.I000OiO("WorkContinuationImpl");
                public final i01IlOO I00000oIO;
                public final String I00000oOI;
                public final Il1OO1ilo0o1 I0000Il00O;
                public final List I0000O;
                public final ArrayList I0000oI00;
                public final ArrayList I0001Ioi1lo = new ArrayList();
                public final List I000II;
                public boolean I000O01llI0;
                public IIloOI I000OOo1O;

                public i01I0IOOI10(i01IlOO i01iloo, String str, Il1OO1ilo0o1 il1OO1ilo0o1, List list, List list2) {
/* 4 */             this.I00000oIO = i01iloo;
/* 6 */             this.I00000oOI = str;
/* 8 */             this.I0000Il00O = il1OO1ilo0o1;
/* 10 */            this.I0000O = list;
/* 12 */            this.I000II = list2;
/* 23 */            this.I0000oI00 = new ArrayList(list.size());
/* 32 */            if (list2 != null) {
/* 34 */                Iterator it = list2.iterator();
/* 42 */                while (it.hasNext()) {
/* 54 */                    this.I0001Ioi1lo.addAll(((i01I0IOOI10) it.next()).I0001Ioi1lo);
                        }
                    }
/* 63 */            for (int i = 0; i < list.size(); i++) {
/* 67 */                if (il1OO1ilo0o1 == Il1OO1ilo0o1.I00iOIl && ((i01OOII) list.get(i)).I00000oOI.getNextScheduleTimeOverride() != Long.MAX_VALUE) {
/* 93 */                    I000II.I000iOII("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
/* 97 */                    throw null;
                        }
/* 106 */               String string = ((i01OOII) list.get(i)).I00000oIO.toString();
/* 112 */               this.I0000oI00.add(string);
/* 117 */               this.I0001Ioi1lo.add(string);
                    }
                }

                public static boolean I00000oOI(i01I0IOOI10 i01i0iooi10, HashSet hashSet) {
/* 3 */             hashSet.addAll(i01i0iooi10.I0000oI00);
/* 6 */             HashSet hashSetI0000Il00O = I0000Il00O(i01i0iooi10);
/* 10 */            Iterator it = hashSet.iterator();
/* 18 */            while (it.hasNext()) {
/* 30 */                if (hashSetI0000Il00O.contains((String) it.next())) {
/* 65 */                    return true;
                        }
                    }
/* 33 */            List list = i01i0iooi10.I000II;
/* 35 */            if (list != null && !list.isEmpty()) {
/* 43 */                Iterator it2 = list.iterator();
/* 51 */                while (it2.hasNext()) {
/* 63 */                    if (I00000oOI((i01I0IOOI10) it2.next(), hashSet)) {
/* 65 */                        return true;
                            }
                        }
                    }
/* 69 */            hashSet.removeAll(i01i0iooi10.I0000oI00);
/* 72 */            return false;
                }

                public static HashSet I0000Il00O(i01I0IOOI10 i01i0iooi10) {
/* 3 */             HashSet hashSet = new HashSet();
/* 6 */             List list = i01i0iooi10.I000II;
/* 8 */             if (list != null && !list.isEmpty()) {
/* 16 */                Iterator it = list.iterator();
/* 24 */                while (it.hasNext()) {
/* 34 */                    hashSet.addAll(((i01I0IOOI10) it.next()).I0000oI00);
                        }
                    }
/* 77 */            return hashSet;
                }

                public final IIloOI I00000oIO() {
/* 3 */             if (this.I000O01llI0) {
/* 91 */                IIi0oIl.I000II().I000l1(I000OiO, "Already enqueued work ids (" + TextUtils.join(", ", this.I0000oI00) + ")");
                    } else {
/* 5 */                 i01IlOO i01iloo = this.I00000oIO;
/* 9 */                 O1oO0lOoI1 o1oO0lOoI1 = i01iloo.I00000oOI.I000oI1ioi;
/* 27 */                String str = "EnqueueRunnable_" + this.I0000Il00O.name();
/* 37 */                OilOol oilOol = (OilOol) ((OillOo0) i01iloo.I0000O).I00iiI;
/* 43 */                OlOi0iollo olOi0iollo = new OlOi0iollo(18);
/* 46 */                olOi0iollo.I00iiI = this;
/* 48 */                VarHandle.storeStoreFence();
/* 55 */                this.I000OOo1O = l1l1IO0Ii.I00000oIO(o1oO0lOoI1, str, oilOol, olOi0iollo);
                    }
/* 94 */            return this.I000OOo1O;
                }
            }
