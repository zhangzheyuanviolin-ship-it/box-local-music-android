            package p000;

            import android.hardware.camera2.CameraCharacteristics;
            import java.lang.invoke.VarHandle;
            
            public abstract class iOiloi0oOI1 {
                /* JADX WARN: Multi-variable type inference failed */
                public static final I1Ioli1lO0il I00000oIO(IIlo0i0ll iIlo0i0ll) {
/* 4 */             int[] iArr = {0};
/* 11 */            Object objI0000O = ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
/* 15 */            if (objI0000O != 0) {
/* 18 */                iArr = objI0000O;
                    }
/* 23 */            I1Ioli1lO0il i1Ioli1lO0il = new I1Ioli1lO0il();
/* 26 */            i1Ioli1lO0il.I00iOIl = iArr;
/* 28 */            VarHandle.storeStoreFence();
/* 77 */            return i1Ioli1lO0il;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static final int I00000oOI(IIlo0i0ll iIlo0i0ll, int i) {
/* 1 */             CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
/* 4 */             int[] iArr = {0};
/* 9 */             IIioli iIioli = (IIioli) iIlo0i0ll;
/* 11 */            Object objI0000O = iIioli.I0000O(key);
/* 15 */            if (objI0000O != 0) {
/* 18 */                iArr = objI0000O;
                    }
/* 25 */            if (I1IoiO1l.I0000oI00(iArr, i)) {
/* 27 */                return i;
                    }
/* 32 */            Object objI0000O2 = iIioli.I0000O(key);
/* 28 */            Object obj = {0};
/* 36 */            if (objI0000O2 != null) {
/* 39 */                obj = objI0000O2;
                    }
                    return I1IoiO1l.I0000oI00((int[]) obj, 1) ? 1 : 0;
                }
            }
