            package p000;

            import android.os.DeadObjectException;
            import android.os.Parcel;
            import android.os.RemoteException;
            import java.util.ArrayList;
            import java.util.Objects;
            
/* 13 */    public final class i0OloII1 extends IoilIilo {
                public final int I0000oI00 = 1;
                public Object I0001Ioi1lo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i0OloII1(i0i01Ii0iII i0i01ii0iii, String str) {
/* 11 */            super(5, (byte) 0);
/* 4 */             this.I0001Ioi1lo = str;
/* 6 */             Objects.requireNonNull(i0i01ii0iii);
                }

                @Override
                public final void I0001Ioi1lo(Io0OoIoOo io0OoIoOo, OloIlI0ll oloIlI0ll) {
                    String string;
                    String string2;
                    ArrayList arrayList;
/* 3 */             iOoIOo1Ililo iooioo1ililo = null;
                    switch (this.I0000oI00) {
                        case 0:
/* 191 */                   ((OOooilOIIl0I) ((IolIIo0o0Iio) this.I0001Ioi1lo).I0000Il00O).accept(io0OoIoOo, oloIlI0ll);
/* 194 */                   return;
                        case 1:
/* 127 */                   lIOlIOO0l liolioo0l = (lIOlIOO0l) io0OoIoOo;
/* 131 */                   String str = (String) this.I0001Ioi1lo;
                            synchronized (liolioo0l) {
                                try {
/* 138 */                           iooioo1ililo = (iOoIOo1Ililo) liolioo0l.I000l1();
                                } catch (DeadObjectException | IllegalStateException unused) {
                                }
/* 141 */                       if (iooioo1ililo == null) {
/* 179 */                           throw new RemoteException("no service for getLicenseDetail call");
                                }
/* 143 */                       Parcel parcelObtain = Parcel.obtain();
/* 149 */                       parcelObtain.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
/* 152 */                       parcelObtain.writeString(str);
/* 156 */                       Parcel parcelI00000oOI = iooioo1ililo.I00000oOI(2, parcelObtain);
/* 160 */                       string = parcelI00000oOI.readString();
/* 164 */                       parcelI00000oOI.recycle();
                            }
/* 168 */                   oloIlI0ll.I00000oOI(string);
/* 171 */                   return;
                        case 2:
/* 67 */                    lIOlIOO0l liolioo0l2 = (lIOlIOO0l) io0OoIoOo;
/* 71 */                    o00i1olooO o00i1olooo = (o00i1olooO) this.I0001Ioi1lo;
                            synchronized (liolioo0l2) {
                                try {
/* 78 */                            iooioo1ililo = (iOoIOo1Ililo) liolioo0l2.I000l1();
                                } catch (DeadObjectException | IllegalStateException unused2) {
                                }
/* 81 */                        if (iooioo1ililo == null) {
/* 123 */                           throw new RemoteException("no service for getLicenseDetail call");
                                }
/* 83 */                        String str2 = o00i1olooo.I00iOIl;
/* 85 */                        Parcel parcelObtain2 = Parcel.obtain();
/* 91 */                        parcelObtain2.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
/* 94 */                        parcelObtain2.writeString(str2);
/* 98 */                        Parcel parcelI00000oOI2 = iooioo1ililo.I00000oOI(4, parcelObtain2);
/* 102 */                       string2 = parcelI00000oOI2.readString();
/* 106 */                       parcelI00000oOI2.recycle();
                            }
/* 110 */                   oloIlI0ll.I00000oOI(string2);
/* 113 */                   return;
                        default:
/* 8 */                     lIOlIOO0l liolioo0l3 = (lIOlIOO0l) io0OoIoOo;
/* 12 */                    ArrayList arrayList2 = (ArrayList) this.I0001Ioi1lo;
                            synchronized (liolioo0l3) {
                                try {
/* 19 */                            iooioo1ililo = (iOoIOo1Ililo) liolioo0l3.I000l1();
                                } catch (DeadObjectException | IllegalStateException unused3) {
                                }
/* 22 */                        if (iooioo1ililo == null) {
/* 62 */                            throw new RemoteException("no service for getLicenseDetail call");
                                }
/* 24 */                        Parcel parcelObtain3 = Parcel.obtain();
/* 30 */                        parcelObtain3.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
/* 33 */                        parcelObtain3.writeList(arrayList2);
/* 37 */                        Parcel parcelI00000oOI3 = iooioo1ililo.I00000oOI(5, parcelObtain3);
/* 43 */                        arrayList = parcelI00000oOI3.readArrayList(iOoI0o0O.I00000oIO);
/* 47 */                        parcelI00000oOI3.recycle();
                            }
/* 51 */                    oloIlI0ll.I00000oOI(arrayList);
/* 54 */                    return;
                    }
                }

/* 14 */        public i0OloII1(boolean z) {
                    super(z);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 15 */        public i0OloII1(i0i01Ii0iII i0i01ii0iii, ArrayList arrayList) {
                    super(5, (byte) 0);
/* 16 */            this.I0001Ioi1lo = arrayList;
                    Objects.requireNonNull(i0i01ii0iii);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public i0OloII1(i0i01Ii0iII i0i01ii0iii, o00i1olooO o00i1olooo) {
                    super(5, (byte) 0);
/* 17 */            this.I0001Ioi1lo = o00i1olooo;
                    Objects.requireNonNull(i0i01ii0iii);
                }
            }
