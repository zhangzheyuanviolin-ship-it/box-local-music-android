            package p000;

            import android.hardware.camera2.CaptureResult;
            import kotlin.jvm.functions.Function1;
            
            public final class Oi10ili0 implements Oi01Ooii1Ol {
                public long I00iOIl;
                public Function1 I00iiI;
                public IOi10loi I00iiO;
                public volatile Long I00iio;

                @Override
                public final void I00IOO(Oi0Iil oi0Iil, long j, I0oIili1iI i0oIili1iI) {
/* 7 */             if (this.I00iiO.I00oII() || this.I00iiO.isCancelled()) {
/* 408 */               return;
                    }
/* 18 */            I0oIl0101 i0oIl0101 = i0oIili1iI.I00iiI;
/* 28 */            Long l = (Long) i0oIl0101.I00iOIl.get(CaptureResult.SENSOR_TIMESTAMP);
/* 30 */            if (l != null && this.I00iio == null) {
/* 36 */                this.I00iio = l;
                    }
/* 38 */            Long l2 = this.I00iio;
/* 46 */            if (this.I00iOIl != 0 && l2 != null && l != null && l.longValue() - l2.longValue() > this.I00iOIl) {
/* 70 */                this.I00iiO.I00O10llo(null);
/* 76 */                l11I11lO.I0000O(3, "CXCP");
                    } else if (((Boolean) this.I00iiI.invoke(i0oIili1iI)).booleanValue()) {
/* 97 */                this.I00iiO.I00O10llo(i0oIili1iI);
                    }
                }
            }
