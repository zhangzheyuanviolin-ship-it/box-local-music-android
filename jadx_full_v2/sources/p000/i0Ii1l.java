            package p000;

            import android.content.Intent;
            import android.os.Bundle;
            import android.os.Parcelable;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class i0Ii1l implements i0OiOI1 {
                public static final OlOilIlol1 I000II = new OlOilIlol1("AssetPackServiceImpl");
                public static final Intent I000O01llI0 = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
                public String I00000oIO;
                public i0O0oOiO11 I00000oOI;
                public i0OI1IOoili1 I0000Il00O;
                public i0Oii0oo1i I0000O;
                public i0Oii0oo1i I0000oI00;
                public AtomicBoolean I0001Ioi1lo;

                public static Bundle I000O01llI0() {
/* 3 */             Bundle bundle = new Bundle();
/* 10 */            bundle.putInt("playcore_version_code", 20300);
/* 15 */            ArrayList<Integer> arrayList = new ArrayList<>();
/* 23 */            arrayList.add(0);
/* 31 */            arrayList.add(1);
/* 36 */            bundle.putIntegerArrayList("supported_compression_formats", arrayList);
/* 41 */            ArrayList<Integer> arrayList2 = new ArrayList<>();
/* 44 */            arrayList2.add(1);
/* 52 */            arrayList2.add(2);
/* 57 */            bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
/* 113 */           return bundle;
                }

                public static o0IiOl I000OOo1O() {
/* 15 */            I000II.I00000oOI("onError(%d)", -11);
/* 23 */            return lOio0o.I0000O(new I1O10lli(-11));
                }

                public static Bundle I000iOII(HashMap map) {
/* 1 */             Bundle bundleI000O01llI0 = I000O01llI0();
/* 7 */             ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
/* 22 */            for (Map.Entry entry : map.entrySet()) {
/* 32 */                Bundle bundle = new Bundle();
/* 43 */                bundle.putString("installed_asset_module_name", (String) entry.getKey());
/* 58 */                bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
/* 61 */                arrayList.add(bundle);
                    }
/* 67 */            bundleI000O01llI0.putParcelableArrayList("installed_asset_module", arrayList);
/* 186 */           return bundleI000O01llI0;
                }

                public static ArrayList I000l1(Collection collection) {
/* 7 */             ArrayList arrayList = new ArrayList(collection.size());
/* 10 */            Iterator it = collection.iterator();
/* 18 */            while (it.hasNext()) {
/* 24 */                String str = (String) it.next();
/* 28 */                Bundle bundle = new Bundle();
/* 33 */                bundle.putString("module_name", str);
/* 36 */                arrayList.add(bundle);
                    }
/* 49 */            return arrayList;
                }

                @Override
                public final o0IiOl I00000oIO(ArrayList arrayList, HashMap map) {
/* 1 */             i0Oii0oo1i i0oii0oo1i = this.I0000O;
/* 3 */             if (i0oii0oo1i == null) {
/* 5 */                 return I000OOo1O();
                    }
/* 18 */            I000II.I0000O("startDownload(%s)", arrayList);
/* 23 */            OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 35 */            i0oii0oo1i.I0000Il00O(new i0I1oiiO1(this, oloIlI0ll, arrayList, map, oloIlI0ll), oloIlI0ll);
/* 42 */            IIloOI iIloOI = new IIloOI(29);
/* 45 */            iIloOI.I00iiI = this;
/* 47 */            VarHandle.storeStoreFence();
/* 50 */            o0IiOl o0iiol = oloIlI0ll.I00000oIO;
/* 52 */            o0iiol.getClass();
/* 57 */            o0iiol.I0000oI00(OloIo0oOIO0.I00000oIO, iIloOI);
/* 89 */            return o0iiol;
                }

                @Override
                public final void I00000oOI(int i) {
/* 1 */             i0Oii0oo1i i0oii0oo1i = this.I0000O;
/* 3 */             if (i0oii0oo1i == null) {
/* 49 */                throw new i0O0lI1oiO("The Play Store app is not installed or is an unofficial version.", i);
                    }
/* 12 */            I000II.I0000O("notifySessionFailed", new Object[0]);
/* 17 */            OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 25 */            i0oii0oo1i.I0000Il00O(new i0IIOl(this, oloIlI0ll, i, oloIlI0ll), oloIlI0ll);
                }

                @Override
                public final void I0000Il00O(int i, String str) {
/* 3 */             I000OiO(i, 10, str);
                }

                @Override
                public final void I0000O(int i, int i2, String str, String str2) {
/* 1 */             i0Oii0oo1i i0oii0oo1i = this.I0000O;
/* 3 */             if (i0oii0oo1i == null) {
/* 483 */               throw new i0O0lI1oiO("The Play Store app is not installed or is an unofficial version.", i);
                    }
/* 12 */            I000II.I0000O("notifyChunkTransferred", new Object[0]);
/* 17 */            OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 32 */            i0oii0oo1i.I0000Il00O(new i0IIIlO01011(this, oloIlI0ll, i, str, str2, i2, oloIlI0ll, 0), oloIlI0ll);
                }

                @Override
                public final void I0000oI00(List list) {
/* 1 */             i0Oii0oo1i i0oii0oo1i = this.I0000O;
/* 3 */             if (i0oii0oo1i == null) {
/* 5 */                 return;
                    }
/* 14 */            I000II.I0000O("cancelDownloads(%s)", list);
/* 19 */            OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 31 */            i0oii0oo1i.I0000Il00O(new i0IIIiIli(this, oloIlI0ll, list, oloIlI0ll, 0), oloIlI0ll);
                }

                @Override
                public final o0IiOl I0001Ioi1lo(int i, int i2, String str, String str2) {
/* 1 */             i0Oii0oo1i i0oii0oo1i = this.I0000O;
/* 3 */             if (i0oii0oo1i == null) {
/* 5 */                 return I000OOo1O();
                    }
/* 26 */            I000II.I0000O("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
/* 31 */            OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 46 */            i0oii0oo1i.I0000Il00O(new i0IIIlO01011(this, oloIlI0ll, i, str, str2, i2, oloIlI0ll, 1), oloIlI0ll);
/* 49 */            return oloIlI0ll.I00000oIO;
                }

                @Override
                public final o0IiOl I000II(HashMap map) {
/* 1 */             i0Oii0oo1i i0oii0oo1i = this.I0000O;
/* 3 */             if (i0oii0oo1i == null) {
/* 5 */                 return I000OOo1O();
                    }
/* 17 */            I000II.I0000O("syncPacks", new Object[0]);
/* 22 */            OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 34 */            i0oii0oo1i.I0000Il00O(new i0IIIiIli(this, oloIlI0ll, map, oloIlI0ll, 1), oloIlI0ll);
/* 37 */            return oloIlI0ll.I00000oIO;
                }

                public final void I000OiO(int i, int i2, String str) {
/* 1 */             i0Oii0oo1i i0oii0oo1i = this.I0000O;
/* 3 */             if (i0oii0oo1i == null) {
/* 215 */               throw new i0O0lI1oiO("The Play Store app is not installed or is an unofficial version.", i);
                    }
/* 12 */            I000II.I0000O("notifyModuleCompleted", new Object[0]);
/* 17 */            OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 30 */            i0oii0oo1i.I0000Il00O(new i0IIOIIi(this, oloIlI0ll, i, str, oloIlI0ll, i2), oloIlI0ll);
                }

                @Override
                public final synchronized void mo17f() {
/* 5 */             if (this.I0000oI00 == null) {
/* 13 */                I000II.I0000oI00("Keep alive connection manager is not initialized.", new Object[0]);
/* 17 */                return;
                    }
/* 20 */            OlOilIlol1 olOilIlol1 = I000II;
/* 26 */            olOilIlol1.I0000O("keepAlive", new Object[0]);
/* 36 */            if (!this.I0001Ioi1lo.compareAndSet(false, true)) {
/* 42 */                olOilIlol1.I0000O("Service is already kept alive.", new Object[0]);
                    } else {
/* 49 */                OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 59 */                this.I0000oI00.I0000Il00O(new i0IIl10ioI(this, oloIlI0ll, oloIlI0ll), oloIlI0ll);
                    }
                }
            }
