            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            
            public abstract class i0I1ioiiIioI implements IInterface {
                public final int I000II;
                public final IBinder I000O01llI0;
                public final String I000OOo1O;

                public i0I1ioiiIioI(IBinder iBinder, String str, int i) {
/* 1 */             this.I000II = i;
/* 3 */             this.I000O01llI0 = iBinder;
/* 5 */             this.I000OOo1O = str;
                }

                public Parcel I00000oOI() {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
/* 7 */             parcelObtain.writeInterfaceToken(this.I000OOo1O);
/* 20 */            return parcelObtain;
                }

                public void I0000O(int i, Parcel parcel) {
                    try {
/* 5 */                 this.I000O01llI0.transact(i, parcel, null, 1);
                    } finally {
/* 13 */                parcel.recycle();
                    }
                }

                public Parcel I0000oI00() {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
/* 7 */             parcelObtain.writeInterfaceToken(this.I000OOo1O);
/* 20 */            return parcelObtain;
                }

                public void I00IoIO0lI(int i, Parcel parcel) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
/* 8 */                 this.I000O01llI0.transact(i, parcel, parcelObtain, 0);
/* 11 */                parcelObtain.readException();
                    } finally {
/* 22 */                parcel.recycle();
/* 25 */                parcelObtain.recycle();
                    }
                }

                public Parcel I00IoO0(int i, Parcel parcel) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
                        try {
/* 8 */                     this.I000O01llI0.transact(i, parcel, parcelObtain, 0);
/* 11 */                    parcelObtain.readException();
/* 17 */                    return parcelObtain;
                        } catch (RuntimeException e) {
/* 21 */                    parcelObtain.recycle();
/* 24 */                    throw e;
                        }
                    } finally {
/* 25 */                parcel.recycle();
                    }
                }

                public Parcel I00IoiI(int i, Parcel parcel) {
/* 1 */             Parcel parcelObtain = Parcel.obtain();
                    try {
                        try {
/* 8 */                     this.I000O01llI0.transact(i, parcel, parcelObtain, 0);
/* 11 */                    parcelObtain.readException();
/* 17 */                    return parcelObtain;
                        } catch (RuntimeException e) {
/* 21 */                    parcelObtain.recycle();
/* 24 */                    throw e;
                        }
                    } finally {
/* 25 */                parcel.recycle();
                    }
                }

                public Parcel I00Iooi00oi() {
/* 1 */             int i = this.I000II;
/* 3 */             String str = this.I000OOo1O;
                    switch (i) {
                        case 2:
/* 80 */                    Parcel parcelObtain = Parcel.obtain();
/* 84 */                    parcelObtain.writeInterfaceToken(str);
/* 87 */                    return parcelObtain;
                        case 3:
/* 72 */                    Parcel parcelObtain2 = Parcel.obtain();
/* 76 */                    parcelObtain2.writeInterfaceToken(str);
/* 79 */                    return parcelObtain2;
                        case 4:
/* 64 */                    Parcel parcelObtain3 = Parcel.obtain();
/* 68 */                    parcelObtain3.writeInterfaceToken(str);
/* 71 */                    return parcelObtain3;
                        case 5:
/* 56 */                    Parcel parcelObtain4 = Parcel.obtain();
/* 60 */                    parcelObtain4.writeInterfaceToken(str);
/* 63 */                    return parcelObtain4;
                        case 6:
/* 48 */                    Parcel parcelObtain5 = Parcel.obtain();
/* 52 */                    parcelObtain5.writeInterfaceToken(str);
/* 55 */                    return parcelObtain5;
                        case 7:
/* 40 */                    Parcel parcelObtain6 = Parcel.obtain();
/* 44 */                    parcelObtain6.writeInterfaceToken(str);
/* 47 */                    return parcelObtain6;
                        case 8:
                        default:
/* 8 */                     Parcel parcelObtain7 = Parcel.obtain();
/* 12 */                    parcelObtain7.writeInterfaceToken(str);
/* 15 */                    return parcelObtain7;
                        case 9:
/* 32 */                    Parcel parcelObtain8 = Parcel.obtain();
/* 36 */                    parcelObtain8.writeInterfaceToken(str);
/* 39 */                    return parcelObtain8;
                        case 10:
/* 24 */                    Parcel parcelObtain9 = Parcel.obtain();
/* 28 */                    parcelObtain9.writeInterfaceToken(str);
/* 31 */                    return parcelObtain9;
                        case 11:
/* 16 */                    Parcel parcelObtain10 = Parcel.obtain();
/* 20 */                    parcelObtain10.writeInterfaceToken(str);
/* 23 */                    return parcelObtain10;
                    }
                }

                public Parcel I00O0i0ii(int i, Parcel parcel) {
/* 1 */             int i2 = this.I000II;
/* 4 */             IBinder iBinder = this.I000O01llI0;
                    switch (i2) {
                        case 2:
/* 209 */                   Parcel parcelObtain = Parcel.obtain();
                            try {
                                try {
/* 213 */                           iBinder.transact(i, parcel, parcelObtain, 0);
/* 216 */                           parcelObtain.readException();
/* 222 */                           return parcelObtain;
                                } catch (RuntimeException e) {
/* 226 */                           parcelObtain.recycle();
/* 229 */                           throw e;
                                }
                            } finally {
                            }
                        case 3:
/* 184 */                   Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                try {
/* 188 */                           iBinder.transact(i, parcel, parcelObtain2, 0);
/* 191 */                           parcelObtain2.readException();
/* 197 */                           return parcelObtain2;
                                } finally {
                                }
                            } catch (RuntimeException e2) {
/* 201 */                       parcelObtain2.recycle();
/* 204 */                       throw e2;
                            }
                        case 4:
/* 159 */                   Parcel parcelObtain3 = Parcel.obtain();
                            try {
                                try {
/* 163 */                           iBinder.transact(i, parcel, parcelObtain3, 0);
/* 166 */                           parcelObtain3.readException();
/* 172 */                           return parcelObtain3;
                                } catch (RuntimeException e3) {
/* 176 */                           parcelObtain3.recycle();
/* 179 */                           throw e3;
                                }
                            } finally {
                            }
                        case 5:
/* 134 */                   Parcel parcelObtain4 = Parcel.obtain();
                            try {
                                try {
/* 138 */                           iBinder.transact(i, parcel, parcelObtain4, 0);
/* 141 */                           parcelObtain4.readException();
/* 147 */                           return parcelObtain4;
                                } catch (RuntimeException e4) {
/* 151 */                           parcelObtain4.recycle();
/* 154 */                           throw e4;
                                }
                            } finally {
                            }
                        case 6:
/* 109 */                   Parcel parcelObtain5 = Parcel.obtain();
                            try {
                                try {
/* 113 */                           iBinder.transact(i, parcel, parcelObtain5, 0);
/* 116 */                           parcelObtain5.readException();
/* 122 */                           return parcelObtain5;
                                } finally {
                                }
                            } catch (RuntimeException e5) {
/* 126 */                       parcelObtain5.recycle();
/* 129 */                       throw e5;
                            }
                        case 7:
/* 84 */                    Parcel parcelObtain6 = Parcel.obtain();
                            try {
                                try {
/* 88 */                            iBinder.transact(i, parcel, parcelObtain6, 0);
/* 91 */                            parcelObtain6.readException();
/* 97 */                            return parcelObtain6;
                                } finally {
                                }
                            } catch (RuntimeException e6) {
/* 101 */                       parcelObtain6.recycle();
/* 104 */                       throw e6;
                            }
                        case 8:
/* 59 */                    Parcel parcelObtain7 = Parcel.obtain();
                            try {
                                try {
/* 63 */                            iBinder.transact(i, parcel, parcelObtain7, 0);
/* 66 */                            parcelObtain7.readException();
/* 72 */                            return parcelObtain7;
                                } finally {
                                }
                            } catch (RuntimeException e7) {
/* 76 */                        parcelObtain7.recycle();
/* 79 */                        throw e7;
                            }
                        case 9:
/* 34 */                    Parcel parcelObtain8 = Parcel.obtain();
                            try {
                                try {
/* 38 */                            iBinder.transact(i, parcel, parcelObtain8, 0);
/* 41 */                            parcelObtain8.readException();
/* 47 */                            return parcelObtain8;
                                } catch (RuntimeException e8) {
/* 51 */                            parcelObtain8.recycle();
/* 54 */                            throw e8;
                                }
                            } finally {
                            }
                        default:
/* 9 */                     Parcel parcelObtain9 = Parcel.obtain();
                            try {
                                try {
/* 13 */                            iBinder.transact(i, parcel, parcelObtain9, 0);
/* 16 */                            parcelObtain9.readException();
/* 22 */                            return parcelObtain9;
                                } catch (RuntimeException e9) {
/* 26 */                            parcelObtain9.recycle();
/* 29 */                            throw e9;
                                }
                            } finally {
                            }
                    }
                }

                public void I00O0o1oo(int i, Parcel parcel) {
                    Parcel parcelObtain;
/* 1 */             int i2 = this.I000II;
/* 4 */             IBinder iBinder = this.I000O01llI0;
                    switch (i2) {
                        case 6:
/* 109 */                   parcelObtain = Parcel.obtain();
                            try {
/* 113 */                       iBinder.transact(i, parcel, parcelObtain, 0);
/* 116 */                       parcelObtain.readException();
/* 125 */                       return;
                            } finally {
                            }
                        case 7:
/* 84 */                    parcelObtain = Parcel.obtain();
                            try {
/* 88 */                        iBinder.transact(i, parcel, parcelObtain, 0);
/* 91 */                        parcelObtain.readException();
/* 100 */                       return;
                            } finally {
                            }
                        case 8:
/* 59 */                    parcelObtain = Parcel.obtain();
                            try {
/* 63 */                        iBinder.transact(i, parcel, parcelObtain, 0);
/* 66 */                        parcelObtain.readException();
/* 75 */                        return;
                            } finally {
                            }
                        case 9:
/* 34 */                    parcelObtain = Parcel.obtain();
                            try {
/* 38 */                        iBinder.transact(i, parcel, parcelObtain, 0);
/* 41 */                        parcelObtain.readException();
/* 50 */                        return;
                            } finally {
                            }
                        default:
/* 9 */                     parcelObtain = Parcel.obtain();
                            try {
/* 13 */                        iBinder.transact(i, parcel, parcelObtain, 0);
/* 16 */                        parcelObtain.readException();
/* 25 */                        return;
                            } finally {
                            }
                    }
                }

                public void I00O10llo(Parcel parcel) {
                    try {
/* 6 */                 this.I000O01llI0.transact(2, parcel, null, 1);
                    } finally {
/* 14 */                parcel.recycle();
                    }
                }

                @Override
                public final IBinder asBinder() {
/* 1 */             int i = this.I000II;
/* 3 */             return this.I000O01llI0;
                }
            }
