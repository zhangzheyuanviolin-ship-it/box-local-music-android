            package p000;

            import android.os.Binder;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.util.Log;
            import androidx.room.MultiInstanceInvalidationService;
            
/* 18 */    public final class OI0O10il extends Binder implements IoOlIoo0I {
                public final MultiInstanceInvalidationService I000II;

                public OI0O10il(MultiInstanceInvalidationService multiInstanceInvalidationService) {
/* 1 */             this.I000II = multiInstanceInvalidationService;
/* 8 */             attachInterface(this, IoOlIoo0I.I0000Il00O);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v11, types: [IoOl1llI1] */
                /* JADX WARN: Type inference failed for: r2v7, types: [IoOl1llI1] */
                @Override
                public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
                    OI0OII10i1oI oI0OII10i1oI;
/* 1 */             String str = IoOlIoo0I.I0000Il00O;
/* 4 */             if (i >= 1 && i <= 16777215) {
/* 11 */                parcel.enforceInterface(str);
                    }
/* 17 */            if (i == 1598968902) {
/* 19 */                parcel2.writeString(str);
/* 3 */                 return true;
                    }
/* 23 */            int i3 = 0;
/* 24 */            IoOl1lO1o ioOl1lO1o = null;
/* 24 */            IoOl1lO1o ioOl1lO1o2 = null;
/* 25 */            if (i == 1) {
/* 215 */               IBinder strongBinder = parcel.readStrongBinder();
/* 219 */               if (strongBinder != null) {
/* 224 */                   IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(IoOl1llI1.I00000oOI);
/* 228 */                   if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IoOl1llI1)) {
/* 240 */                       IoOl1lO1o ioOl1lO1o3 = new IoOl1lO1o();
/* 243 */                       ioOl1lO1o3.I000II = strongBinder;
                                ioOl1lO1o = ioOl1lO1o3;
                            } else {
/* 235 */                       ioOl1lO1o = (IoOl1llI1) iInterfaceQueryLocalInterface;
                            }
                        }
/* 245 */               String string = parcel.readString();
/* 249 */               if (string != null) {
/* 252 */                   MultiInstanceInvalidationService multiInstanceInvalidationService = this.I000II;
                            synchronized (multiInstanceInvalidationService.I00iiO) {
                                try {
/* 259 */                           int i4 = multiInstanceInvalidationService.I00iOIl + 1;
/* 260 */                           multiInstanceInvalidationService.I00iOIl = i4;
/* 272 */                           if (multiInstanceInvalidationService.I00iiO.register(ioOl1lO1o, Integer.valueOf(i4))) {
/* 280 */                               multiInstanceInvalidationService.I00iiI.put(Integer.valueOf(i4), string);
/* 283 */                               i3 = i4;
                                    } else {
                                        multiInstanceInvalidationService.I00iOIl--;
                                    }
                                } catch (Throwable th) {
/* 1182 */                          throw th;
                                }
                            }
                        }
/* 294 */               parcel2.writeNoException();
/* 297 */               parcel2.writeInt(i3);
/* 3 */                 return true;
                    }
/* 28 */            if (i == 2) {
/* 151 */               IBinder strongBinder2 = parcel.readStrongBinder();
/* 155 */               if (strongBinder2 != null) {
/* 160 */                   IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(IoOl1llI1.I00000oOI);
/* 164 */                   if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof IoOl1llI1)) {
/* 176 */                       IoOl1lO1o ioOl1lO1o4 = new IoOl1lO1o();
/* 179 */                       ioOl1lO1o4.I000II = strongBinder2;
                                ioOl1lO1o2 = ioOl1lO1o4;
                            } else {
/* 171 */                       ioOl1lO1o2 = (IoOl1llI1) iInterfaceQueryLocalInterface2;
                            }
                        }
/* 181 */               int i5 = parcel.readInt();
/* 185 */               MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.I000II;
                        synchronized (multiInstanceInvalidationService2.I00iiO) {
/* 192 */                   multiInstanceInvalidationService2.I00iiO.unregister(ioOl1lO1o2);
                        }
/* 208 */               parcel2.writeNoException();
/* 3 */                 return true;
                    }
/* 31 */            if (i != 3) {
/* 33 */                return super.onTransact(i, parcel, parcel2, i2);
                    }
/* 38 */            int i6 = parcel.readInt();
/* 42 */            String[] strArrCreateStringArray = parcel.createStringArray();
/* 46 */            MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.I000II;
                    synchronized (multiInstanceInvalidationService3.I00iiO) {
/* 61 */                String str2 = (String) multiInstanceInvalidationService3.I00iiI.get(Integer.valueOf(i6));
/* 63 */                if (str2 == null) {
/* 69 */                    Log.w("ROOM", "Remote invalidation client ID not registered");
                        } else {
/* 78 */                    int iBeginBroadcast = multiInstanceInvalidationService3.I00iiO.beginBroadcast();
                            while (true) {
/* 82 */                        oI0OII10i1oI = multiInstanceInvalidationService3.I00iiO;
/* 84 */                        if (i3 >= iBeginBroadcast) {
                                    break;
                                }
                                try {
/* 90 */                            Integer num = (Integer) oI0OII10i1oI.getBroadcastCookie(i3);
/* 92 */                            int iIntValue = num.intValue();
/* 102 */                           String str3 = (String) multiInstanceInvalidationService3.I00iiI.get(num);
/* 104 */                           if (i6 != iIntValue && str2.equals(str3)) {
                                        try {
/* 121 */                                   ((IoOl1llI1) multiInstanceInvalidationService3.I00iiO.getBroadcastItem(i3)).I000lI(strArrCreateStringArray);
                                        } catch (RemoteException e) {
/* 132 */                                   Log.w("ROOM", "Error invoking a remote callback", e);
                                        }
                                    }
/* 135 */                           i3++;
                                } catch (Throwable th2) {
/* 140 */                           multiInstanceInvalidationService3.I00iiO.finishBroadcast();
/* 143 */                           throw th2;
                                }
                            }
/* 144 */                   oI0OII10i1oI.finishBroadcast();
                        }
                    }
/* 3 */             return true;
                }

                @Override
/* 19 */        public final IBinder asBinder() {
/* 20 */            return this;
                }
            }
