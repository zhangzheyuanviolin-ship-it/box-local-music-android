            package p000;

            import android.os.Parcel;
            import android.os.Process;
            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            
            public abstract class il1Oll0Ii {
                public static final Exception I00000oIO(String str, FileNotFoundException fileNotFoundException) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    int i;
/* 3 */             boolean zEquals = false;
                    try {
/* 18 */                Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
                        try {
/* 22 */                    Parcel parcelObtain = Parcel.obtain();
/* 30 */                    Process.myUserHandle().writeToParcel(parcelObtain, 0);
/* 33 */                    parcelObtain.setDataPosition(0);
/* 36 */                    i = parcelObtain.readInt();
                        } catch (Throwable unused) {
/* 41 */                    i = 0;
                        }
/* 74 */                zEquals = ((String) method.invoke(null, "sys.user." + i + ".ce_available", "false")).equals("true");
                    } catch (Throwable th) {
/* 80 */                ilIilolOlIoO.I00000oIO(fileNotFoundException, th);
                    }
/* 83 */            if (zEquals || str == null) {
/* 88 */                return fileNotFoundException;
                    }
/* 93 */            File file = new File(str, "siblingTestFile.txt");
/* 100 */           if (file.exists()) {
/* 102 */               file.delete();
                    }
                    try {
/* 105 */               file.createNewFile();
/* 111 */               return fileNotFoundException;
                    } catch (IOException unused2) {
/* 116 */               I00IlilI0i0i i00IlilI0i0i = new I00IlilI0i0i(fileNotFoundException);
/* 142 */               i00IlilI0i0i.I00iiI = "Encountered a [" + fileNotFoundException.getMessage() + "]. If you are trying to use DataStore during direct boot, this exception likely indicates that your DataStore file is not located in the Device Encrypted Storage and therefore is not available for write access during direct boot mode. DataStore to be used during direct boot must be initialized using `DataStoreFactory.createInDeviceProtectedStorage()`.";
/* 144 */               VarHandle.storeStoreFence();
/* 150 */               return i00IlilI0i0i;
                    } finally {
/* 151 */               file.delete();
                    }
                }
            }
