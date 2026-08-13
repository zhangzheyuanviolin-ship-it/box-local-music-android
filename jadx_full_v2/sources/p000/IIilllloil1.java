            package p000;

            import java.util.concurrent.CopyOnWriteArrayList;
            
            public final class IIilllloil1 implements AutoCloseable {
                public IIOlO1ii I00iOIl;
                public CopyOnWriteArrayList I00iiI;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(long j, IOoilo iOoilo) throws Throwable {
                    IIill0I0 iIill0I0;
                    IOi10loi iOi10loi;
/* 1 */             CopyOnWriteArrayList copyOnWriteArrayList = this.I00iiI;
/* 5 */             if (iOoilo instanceof IIill0I0) {
/* 8 */                 iIill0I0 = (IIill0I0) iOoilo;
/* 10 */                int i = iIill0I0.I00iio;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    iIill0I0.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    iIill0I0 = new IIill0I0(this, iOoilo);
                        }
                    }
/* 27 */            Object obj = iIill0I0.I00iiI;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = iIill0I0.I00iio;
/* 33 */            Object[] objArr = 0;
/* 34 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 36 */            if (i2 == 0) {
/* 52 */                lIoii1l01l0i.I00000oOI(obj);
/* 57 */                IOi10loi iOi10loi2 = new IOi10loi();
/* 60 */                copyOnWriteArrayList.add(iOi10loi2);
/* 65 */                IIillIIO iIillIIO = new IIillIIO(iOi10loi2, iOoil1iiIilo, objArr == true ? 1 : 0);
/* 68 */                iIill0I0.I00iOIl = iOi10loi2;
/* 70 */                iIill0I0.I00iio = 1;
/* 72 */                Object objI0000Il00O = lOlo0o.I0000Il00O(j, iIillIIO, iIill0I0);
/* 76 */                if (objI0000Il00O == ii0111o) {
/* 78 */                    return ii0111o;
                        }
/* 80 */                iOi10loi = iOi10loi2;
/* 81 */                obj = objI0000Il00O;
                    } else {
/* 38 */                if (i2 != 1) {
/* 48 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 34 */                    return null;
                        }
/* 40 */                iOi10loi = iIill0I0.I00iOIl;
/* 42 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 82 */            boolean z = obj != null;
/* 85 */            copyOnWriteArrayList.remove(iOi10loi);
/* 88 */            return Boolean.valueOf(z);
                }

                @Override
                public final void close() {
/* 4 */             il001oo1.I00000oOI(this.I00iOIl, null);
                }
            }
