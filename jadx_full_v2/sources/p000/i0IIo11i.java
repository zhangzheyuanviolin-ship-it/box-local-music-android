            package p000;

            import android.os.Bundle;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class i0IIo11i extends i0IiIO implements IInterface {
                public final OloIlI0ll I000O01llI0;
                public final i0Ii1l I000OOo1O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i0IIo11i(i0Ii1l i0ii1l, OloIlI0ll oloIlI0ll) {
/* 6 */             super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback", 0);
/* 1 */             this.I000OOo1O = i0ii1l;
/* 9 */             this.I000O01llI0 = oloIlI0ll;
                }

                @Override
                public final boolean I00IoIO0lI(int i, Parcel parcel) {
/* 3 */             i0Oii0oo1i i0oii0oo1i = this.I000OOo1O.I0000O;
/* 10 */            OloIlI0ll oloIlI0ll = this.I000O01llI0;
                    switch (i) {
                        case 2:
/* 390 */                   int i2 = parcel.readInt();
/* 394 */                   Parcelable.Creator creator = Bundle.CREATOR;
/* 400 */                   Bundle bundle = (Bundle) i0IoOOOoOIoI.I00000oIO(parcel);
/* 402 */                   i0IoOOOoOIoI.I00000oOI(parcel);
/* 405 */                   I00OIO1(i2, bundle);
/* 408 */                   return true;
                        case 3:
/* 356 */                   int i3 = parcel.readInt();
/* 360 */                   Parcelable.Creator creator2 = Bundle.CREATOR;
/* 368 */                   i0IoOOOoOIoI.I00000oOI(parcel);
/* 371 */                   i0oii0oo1i.I0000O(oloIlI0ll);
/* 386 */                   i0Ii1l.I000II.I0000O("onCancelDownload(%d)", Integer.valueOf(i3));
/* 408 */                   return true;
                        case 4:
/* 322 */                   int i4 = parcel.readInt();
/* 326 */                   Parcelable.Creator creator3 = Bundle.CREATOR;
/* 334 */                   i0IoOOOoOIoI.I00000oOI(parcel);
/* 337 */                   i0oii0oo1i.I0000O(oloIlI0ll);
/* 352 */                   i0Ii1l.I000II.I0000O("onGetSession(%d)", Integer.valueOf(i4));
/* 408 */                   return true;
                        case 5:
/* 311 */                   ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
/* 315 */                   i0IoOOOoOIoI.I00000oOI(parcel);
/* 318 */                   I00O10llo(arrayListCreateTypedArrayList);
/* 408 */                   return true;
                        case 6:
/* 249 */                   Parcelable.Creator creator4 = Bundle.CREATOR;
/* 255 */                   Bundle bundle2 = (Bundle) i0IoOOOoOIoI.I00000oIO(parcel);
/* 263 */                   i0IoOOOoOIoI.I00000oOI(parcel);
/* 266 */                   i0oii0oo1i.I0000O(oloIlI0ll);
/* 305 */                   i0Ii1l.I000II.I0000O("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle2.getString("module_name"), bundle2.getString("slice_id"), Integer.valueOf(bundle2.getInt("chunk_number")), Integer.valueOf(bundle2.getInt("session_id")));
/* 408 */                   return true;
                        case 7:
/* 233 */                   Parcelable.Creator creator5 = Bundle.CREATOR;
/* 239 */                   Bundle bundle3 = (Bundle) i0IoOOOoOIoI.I00000oIO(parcel);
/* 241 */                   i0IoOOOoOIoI.I00000oOI(parcel);
/* 244 */                   I00O0i0ii(bundle3);
/* 408 */                   return true;
                        case 8:
/* 188 */                   Parcelable.Creator creator6 = Bundle.CREATOR;
/* 194 */                   Bundle bundle4 = (Bundle) i0IoOOOoOIoI.I00000oIO(parcel);
/* 202 */                   i0IoOOOoOIoI.I00000oOI(parcel);
/* 205 */                   i0oii0oo1i.I0000O(oloIlI0ll);
/* 228 */                   i0Ii1l.I000II.I0000O("onNotifyModuleCompleted(%s, sessionId=%d)", bundle4.getString("module_name"), Integer.valueOf(bundle4.getInt("session_id")));
/* 408 */                   return true;
                        case 9:
                        default:
/* 9 */                     return false;
                        case 10:
/* 147 */                   Parcelable.Creator creator7 = Bundle.CREATOR;
/* 153 */                   Bundle bundle5 = (Bundle) i0IoOOOoOIoI.I00000oIO(parcel);
/* 161 */                   i0IoOOOoOIoI.I00000oOI(parcel);
/* 164 */                   i0oii0oo1i.I0000O(oloIlI0ll);
/* 183 */                   i0Ii1l.I000II.I0000O("onNotifySessionFailed(%d)", Integer.valueOf(bundle5.getInt("session_id")));
/* 408 */                   return true;
                        case 11:
/* 125 */                   Parcelable.Creator creator8 = Bundle.CREATOR;
/* 131 */                   Bundle bundle6 = (Bundle) i0IoOOOoOIoI.I00000oIO(parcel);
/* 137 */                   Bundle bundle7 = (Bundle) i0IoOOOoOIoI.I00000oIO(parcel);
/* 139 */                   i0IoOOOoOIoI.I00000oOI(parcel);
/* 142 */                   I00OI1(bundle6, bundle7);
/* 408 */                   return true;
                        case 12:
/* 103 */                   Parcelable.Creator creator9 = Bundle.CREATOR;
/* 109 */                   Bundle bundle8 = (Bundle) i0IoOOOoOIoI.I00000oIO(parcel);
/* 115 */                   Bundle bundle9 = (Bundle) i0IoOOOoOIoI.I00000oIO(parcel);
/* 117 */                   i0IoOOOoOIoI.I00000oOI(parcel);
/* 120 */                   I00O0o1oo(bundle8, bundle9);
/* 408 */                   return true;
                        case 13:
/* 72 */                    Parcelable.Creator creator10 = Bundle.CREATOR;
/* 86 */                    i0IoOOOoOIoI.I00000oOI(parcel);
/* 89 */                    i0oii0oo1i.I0000O(oloIlI0ll);
/* 98 */                    i0Ii1l.I000II.I0000O("onRequestDownloadInfo()", new Object[0]);
/* 408 */                   return true;
                        case 14:
/* 41 */                    Parcelable.Creator creator11 = Bundle.CREATOR;
/* 55 */                    i0IoOOOoOIoI.I00000oOI(parcel);
/* 58 */                    i0oii0oo1i.I0000O(oloIlI0ll);
/* 67 */                    i0Ii1l.I000II.I0000O("onRemoveModule()", new Object[0]);
/* 408 */                   return true;
                        case 15:
/* 16 */                    Parcelable.Creator creator12 = Bundle.CREATOR;
/* 24 */                    i0IoOOOoOIoI.I00000oOI(parcel);
/* 27 */                    i0oii0oo1i.I0000O(oloIlI0ll);
/* 36 */                    i0Ii1l.I000II.I0000O("onCancelDownloads()", new Object[0]);
/* 408 */                   return true;
                    }
                }

                public void I00O0i0ii(Bundle bundle) {
/* 3 */             i0Oii0oo1i i0oii0oo1i = this.I000OOo1O.I0000O;
/* 5 */             OloIlI0ll oloIlI0ll = this.I000O01llI0;
/* 7 */             i0oii0oo1i.I0000O(oloIlI0ll);
/* 12 */            int i = bundle.getInt("error_code");
/* 28 */            i0Ii1l.I000II.I00000oOI("onError(%d)", Integer.valueOf(i));
/* 36 */            oloIlI0ll.I0000Il00O(new I1O10lli(i));
                }

                public void I00O0o1oo(Bundle bundle, Bundle bundle2) {
/* 7 */             this.I000OOo1O.I0000O.I0000O(this.I000O01llI0);
/* 17 */            i0Ii1l.I000II.I0000O("onGetChunkFileDescriptor", new Object[0]);
                }

                public void I00O10llo(List list) {
/* 7 */             this.I000OOo1O.I0000O.I0000O(this.I000O01llI0);
/* 17 */            i0Ii1l.I000II.I0000O("onGetSessionStates", new Object[0]);
                }

                public void I00OI1(Bundle bundle, Bundle bundle2) {
/* 7 */             this.I000OOo1O.I0000oI00.I0000O(this.I000O01llI0);
/* 28 */            i0Ii1l.I000II.I0000O("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
                }

                public void I00OIO1(int i, Bundle bundle) {
/* 7 */             this.I000OOo1O.I0000O.I0000O(this.I000O01llI0);
/* 22 */            i0Ii1l.I000II.I0000O("onStartDownload(%d)", Integer.valueOf(i));
                }
            }
