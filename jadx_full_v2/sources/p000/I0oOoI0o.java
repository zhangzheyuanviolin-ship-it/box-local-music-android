            package p000;

            import android.util.Log;
            import android.view.Surface;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class I0oOoI0o implements IO0I000 {
                public OlOO00iI0lI I00000oIO;

                @Override
                public final IO01oi0 I00000oIO(IIlOl1oOlo1o iIlOl1oOlo1o, Map map, IO0Il0o1OI iO0Il0o1OI) throws Exception {
/* 7 */             ArrayList arrayList = new ArrayList(map.size());
/* 14 */            Iterator it = map.entrySet().iterator();
/* 22 */            while (it.hasNext()) {
/* 36 */                arrayList.add((Surface) ((Map.Entry) it.next()).getValue());
                    }
/* 44 */            if (iIlOl1oOlo1o.I00o0iI0io1(arrayList, iO0Il0o1OI)) {
/* 94 */                return new IO01oi(Il011I1OiO0I.I00iOIl, iOl0ll0OI1II.I00000oOI(map, this.I00000oIO));
                    }
/* 75 */            Log.w("CXCP", "Failed to create ConstrainedHighSpeedCaptureSession from " + iIlOl1oOlo1o + " for " + iO0Il0o1OI + '!');
/* 78 */            iO0Il0o1OI.I00000oIO();
/* 81 */            return loilIl10Ii.I00iiO;
                }
            }
