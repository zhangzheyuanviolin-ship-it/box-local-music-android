            package p000;

            import androidx.work.impl.WorkDatabase;
            import androidx.work.impl.model.DependencyDao;
            import androidx.work.impl.model.WorkSpecDao;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public abstract class iOl0OOll {
                public static final void I00000oIO(i01IlOO i01iloo, String str) {
                    i01ilO i01iloI00000oOI;
/* 1 */             WorkDatabase workDatabase = i01iloo.I0000Il00O;
/* 3 */             WorkSpecDao workSpecDaoI001lIiIIo1O = workDatabase.I001lIiIIo1O();
/* 7 */             DependencyDao dependencyDaoI001IIilI0O = workDatabase.I001IIilI0O();
/* 15 */            ArrayList arrayListI000OiO = IOOi1I.I000OiO(str);
/* 23 */            while (!arrayListI000OiO.isEmpty()) {
/* 29 */                String str2 = (String) IOOii0O10Io0.I00111O(arrayListI000OiO);
/* 31 */                i01IOiO1lO state = workSpecDaoI001lIiIIo1O.getState(str2);
/* 37 */                if (state != i01IOiO1lO.I00iiO && state != i01IOiO1lO.I00iio) {
/* 43 */                    workSpecDaoI001lIiIIo1O.setCancelledState(str2);
                        }
/* 52 */                arrayListI000OiO.addAll(dependencyDaoI001IIilI0O.getDependentWorkIds(str2));
                    }
/* 56 */            OOIo1i0 oOIo1i0 = i01iloo.I0001Ioi1lo;
                    synchronized (oOIo1i0.I000iOII) {
/* 65 */                IIi0oIl.I000II().getClass();
/* 70 */                oOIo1i0.I000OOo1O.add(str);
/* 73 */                i01iloI00000oOI = oOIo1i0.I00000oOI(str);
                    }
/* 79 */            OOIo1i0.I0000O(i01iloI00000oOI, 1);
/* 84 */            Iterator it = i01iloo.I0000oI00.iterator();
/* 92 */            while (it.hasNext()) {
/* 100 */               ((OiOI1oIoooI) it.next()).I0000oI00(str);
                    }
                }
            }
