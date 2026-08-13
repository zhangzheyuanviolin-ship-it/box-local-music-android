            package p000;

            import androidx.work.impl.model.Dependency;
            import androidx.work.impl.model.DependencyDao;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class IiO010ll00Oi implements DependencyDao {
                public Oi1oIiOiIi0 I00000oIO;
                public IOol1o01iII I00000oOI;

                @Override
                public final List getDependentWorkIds(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(8);
/* 10 */            i0ioO0Oio0ll.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 21 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, i0ioO0Oio0ll);
                }

                @Override
                public final List getPrerequisites(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(11);
/* 10 */            i0ioO0Oio0ll.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 21 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, i0ioO0Oio0ll);
                }

                @Override
                public final boolean hasCompletedAllPrerequisites(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(10);
/* 10 */            i0ioO0Oio0ll.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 23 */            return ((Boolean) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, i0ioO0Oio0ll)).booleanValue();
                }

                @Override
                public final boolean hasDependents(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(9);
/* 10 */            i0ioO0Oio0ll.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 23 */            return ((Boolean) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, i0ioO0Oio0ll)).booleanValue();
                }

                @Override
                public final void insertDependency(Dependency dependency) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             I00o101lO i00o101lO = new I00o101lO(29);
/* 10 */            i00o101lO.I00iiI = this;
/* 12 */            i00o101lO.I00iiO = dependency;
/* 14 */            VarHandle.storeStoreFence();
/* 19 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, i00o101lO);
                }
            }
