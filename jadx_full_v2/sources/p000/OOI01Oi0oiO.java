            package p000;

            import androidx.work.impl.model.Preference;
            import androidx.work.impl.model.PreferenceDao;
            import java.lang.invoke.VarHandle;
            
            public final class OOI01Oi0oiO implements PreferenceDao {
                public Oi1oIiOiIi0 I00000oIO;
                public IOol1o01iII I00000oOI;

                @Override
                public final Long getLongValue(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(26);
/* 10 */            i0ioO0Oio0ll.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 21 */            return (Long) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, i0ioO0Oio0ll);
                }

                @Override
                public final O110lI getObservableLongValue(String str) {
/* 17 */            I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(25);
/* 20 */            i0ioO0Oio0ll.I00iiI = str;
/* 22 */            VarHandle.storeStoreFence();
/* 26 */            return this.I00000oIO.I0001Ioi1lo().I00000oIO(new String[]{"Preference"}, false, i0ioO0Oio0ll);
                }

                @Override
                public final void insertPreference(Preference preference) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             O1lIIi o1lIIi = new O1lIIi(20);
/* 10 */            o1lIIi.I00iiI = this;
/* 12 */            o1lIIi.I00iiO = preference;
/* 14 */            VarHandle.storeStoreFence();
/* 19 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, o1lIIi);
                }
            }
