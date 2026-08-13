            package p000;

            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.util.Log;
            
            public final class il1I00I extends i0IiIO {
                public I1oIol10O I000O01llI0;
                public int I000OOo1O;

                @Override
                public final boolean I00Iooi00oi(int i, Parcel parcel, Parcel parcel2) {
/* 4 */             if (i == 1) {
/* 149 */               int i2 = parcel.readInt();
/* 153 */               IBinder strongBinder = parcel.readStrongBinder();
/* 163 */               Bundle bundle = (Bundle) iil1OIloI1i.I00000oIO(parcel, Bundle.CREATOR);
/* 165 */               iil1OIloI1i.I0000Il00O(parcel);
/* 172 */               lII0I0I000I.I000O01llI0("onPostInitComplete can be called only once per call to getRemoteService", this.I000O01llI0);
/* 175 */               I1oIol10O i1oIol10O = this.I000O01llI0;
/* 177 */               int i3 = this.I000OOo1O;
/* 179 */               i1oIol10O.getClass();
/* 184 */               io0ooO000l1i io0ooo000l1i = new io0ooO000l1i(i1oIol10O, i2, strongBinder, bundle);
/* 187 */               iOoO0iili iooo0iili = i1oIol10O.I0001Ioi1lo;
/* 193 */               iooo0iili.sendMessage(iooo0iili.obtainMessage(1, i3, -1, io0ooo000l1i));
/* 196 */               this.I000O01llI0 = null;
                    } else if (i == 2) {
/* 122 */               parcel.readInt();
/* 133 */               iil1OIloI1i.I0000Il00O(parcel);
/* 145 */               Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
                    } else {
/* 10 */                if (i != 3) {
/* 12 */                    return false;
                        }
/* 14 */                int i4 = parcel.readInt();
/* 18 */                IBinder strongBinder2 = parcel.readStrongBinder();
/* 28 */                l1O1o0o10o l1o1o0o10o = (l1O1o0o10o) iil1OIloI1i.I00000oIO(parcel, l1O1o0o10o.CREATOR);
/* 30 */                iil1OIloI1i.I0000Il00O(parcel);
/* 33 */                I1oIol10O i1oIol10O2 = this.I000O01llI0;
/* 37 */                lII0I0I000I.I000O01llI0("onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService", i1oIol10O2);
/* 40 */                lII0I0I000I.I000II(l1o1o0o10o);
/* 43 */                i1oIol10O2.I001i1O0Ol = l1o1o0o10o;
/* 49 */                if (i1oIol10O2.I0010o()) {
/* 51 */                    IOloii1OiOI iOloii1OiOI = l1o1o0o10o.I00iio;
/* 53 */                    Oi1ol0llI oi1ol0llII000l1 = Oi1ol0llI.I000l1();
/* 61 */                    Oi1oo0 oi1oo0 = iOloii1OiOI == null ? null : iOloii1OiOI.I00iOIl;
                            synchronized (oi1ol0llII000l1) {
/* 64 */                        if (oi1oo0 == null) {
/* 66 */                            oi1oo0 = Oi1ol0llI.I00iio;
                                } else {
/* 76 */                            Oi1oo0 oi1oo02 = (Oi1oo0) oi1ol0llII000l1.I00iiI;
/* 78 */                            if (oi1oo02 == null || oi1oo02.I00iOIl < oi1oo0.I00iOIl) {
                                    }
                                }
/* 68 */                        oi1ol0llII000l1.I00iiI = oi1oo0;
                            }
                        }
/* 89 */                Bundle bundle2 = l1o1o0o10o.I00iOIl;
/* 95 */                lII0I0I000I.I000O01llI0("onPostInitComplete can be called only once per call to getRemoteService", this.I000O01llI0);
/* 98 */                I1oIol10O i1oIol10O3 = this.I000O01llI0;
/* 100 */               int i5 = this.I000OOo1O;
/* 102 */               i1oIol10O3.getClass();
/* 107 */               io0ooO000l1i io0ooo000l1i2 = new io0ooO000l1i(i1oIol10O3, i4, strongBinder2, bundle2);
/* 110 */               iOoO0iili iooo0iili2 = i1oIol10O3.I0001Ioi1lo;
/* 116 */               iooo0iili2.sendMessage(iooo0iili2.obtainMessage(1, i5, -1, io0ooo000l1i2));
/* 119 */               this.I000O01llI0 = null;
                    }
/* 198 */           parcel2.writeNoException();
/* 3 */             return true;
                }
            }
