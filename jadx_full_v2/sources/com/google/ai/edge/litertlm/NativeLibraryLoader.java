            package com.google.ai.edge.litertlm;

            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.util.Locale;
            import java.util.regex.Pattern;
            import kotlin.Metadata;
            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.IlIi0I0;
            import p000.Oi010OO0;
            import p000.OlOoOIi0o;
            import p000.OlOolloIIOl0;
            
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020 ¢\u0006\u0004\b#\u0010\u0003J\u0010\u0010$\u001a\u00020 H\u0086 ¢\u0006\u0004\b$\u0010\u0003R\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/google/ai/edge/litertlm/NativeLibraryLoader;", "", "<init>", "()V", "", "isLoaded", "()Z", "", "libName", "tryLoadLibrary", "(Ljava/lang/String;)Z", "resourcePath", "tryExtractAndLoad", "(Ljava/lang/String;Ljava/lang/String;)Z", "Ljava/io/InputStream;", "resource", "resourceName", "extractToDirectory", "extractResource", "(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "os", "()Ljava/lang/String;", "architecture", "src", "Ljava/io/File;", "dstFile", "", "copy", "(Ljava/io/InputStream;Ljava/io/File;)J", "createTemporaryDirectory", "()Ljava/io/File;", "msg", "LOoiIlOl1iI;", "log", "(Ljava/lang/String;)V", "load", "nativeCheckLoaded", "JNI_LIBNAME", "Ljava/lang/String;", "DEBUG", "Z", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class NativeLibraryLoader {
                private static final boolean DEBUG;
                public static final NativeLibraryLoader INSTANCE = new NativeLibraryLoader();
                private static final String JNI_LIBNAME = "litertlm_jni";

                static {
/* 19 */            DEBUG = System.getProperty("com.google.ai.edge.litertlm.NativeLibraryLoader.DEBUG") != null;
                }

                private NativeLibraryLoader() {
                }

                private final String architecture() {
/* 11 */            String lowerCase = System.getProperty("os.arch", "").toLowerCase(Locale.ROOT);
                    return lowerCase.equals("amd64") ? "x86_64" : lowerCase;
                }

                private final long copy(InputStream src, File dstFile) throws IOException {
/* 3 */             FileOutputStream fileOutputStream = new FileOutputStream(dstFile);
                    try {
/* 8 */                 byte[] bArr = new byte[1048576];
/* 10 */                int i = src.read(bArr);
/* 14 */                long j = 0;
/* 16 */                while (i >= 0) {
/* 19 */                    fileOutputStream.write(bArr, 0, i);
/* 23 */                    j += i;
/* 24 */                    i = src.read(bArr);
                        }
/* 31 */                fileOutputStream.close();
/* 34 */                return j;
                    } finally {
                    }
                }

                private final File createTemporaryDirectory() {
/* 9 */             File file = new File(System.getProperty("java.io.tmpdir"));
/* 20 */            String strI000l1 = IlIi0I0.I000l1(System.currentTimeMillis(), "litertlm_native_libraries-", "-");
/* 27 */            for (int i = 0; i < 1000; i++) {
/* 35 */                File file2 = new File(file, Oi010OO0.I000oI1ioi(i, strI000l1));
/* 42 */                if (file2.mkdir()) {
/* 44 */                    return file2;
                        }
                    }
/* 56 */            I000II.I001IO000(IlIi0I0.I000lI("Could not create a temporary directory (tried to make ", strI000l1, "*) to extract LiteRT-LM native libraries."));
/* 59 */            return null;
                }

                private final String extractResource(InputStream resource, String resourceName, String extractToDirectory) throws IOException {
/* 3 */             File file = new File(extractToDirectory, resourceName);
/* 6 */             file.deleteOnExit();
/* 9 */             String string = file.toString();
/* 19 */            log("extracting native library to: ".concat(string));
/* 48 */            log("copied " + copy(resource, file) + " bytes to " + string);
/* 98 */            return string;
                }

                private final boolean isLoaded() {
                    try {
/* 1 */                 nativeCheckLoaded();
/* 4 */                 return true;
                    } catch (UnsatisfiedLinkError unused) {
/* 6 */                 return false;
                    }
                }

                private final void log(String msg) {
/* 3 */             if (DEBUG) {
/* 21 */                System.err.println("com.google.ai.edge.litertlm.NativeLibraryLoader: " + msg);
                    }
                }

                private final String os() {
/* 11 */            String lowerCase = System.getProperty("os.name", "").toLowerCase(Locale.ROOT);
                    return OlOoOIi0o.I000oI1ioi(lowerCase, "linux", false) ? "linux" : (OlOoOIi0o.I000oI1ioi(lowerCase, "os x", false) || OlOoOIi0o.I000oI1ioi(lowerCase, "darwin", false)) ? "darwin" : OlOoOIi0o.I000oI1ioi(lowerCase, "windows", false) ? "windows" : Pattern.compile("\\s").matcher(lowerCase).replaceAll("");
                }

                private final boolean tryExtractAndLoad(String resourcePath, String libName) {
/* 9 */             log(IIl001iO0Io.I000o00OoI0I("Attempting to extract from: ", resourcePath));
/* 14 */            ClassLoader classLoader = NativeLibraryLoader.class.getClassLoader();
/* 25 */            InputStream resourceAsStream = classLoader != null ? classLoader.getResourceAsStream(resourcePath) : null;
/* 27 */            if (resourceAsStream == null) {
/* 35 */                log(IIl001iO0Io.I000o00OoI0I("Resource not found: ", resourcePath));
/* 26 */                return false;
                    }
                    try {
/* 39 */                File fileCreateTemporaryDirectory = createTemporaryDirectory();
/* 43 */                fileCreateTemporaryDirectory.deleteOnExit();
/* 54 */                System.load(extractResource(resourceAsStream, libName, fileCreateTemporaryDirectory.getCanonicalPath()));
/* 57 */                return true;
                    } catch (IOException e) {
/* 107 */               log("Failed to extract " + resourcePath + ": " + e);
/* 26 */                return false;
                    } catch (UnsatisfiedLinkError e2) {
/* 83 */                log("Failed to load extracted library from " + resourcePath + ": " + e2);
/* 26 */                return false;
                    }
                }

                private final boolean tryLoadLibrary(String libName) {
                    try {
/* 1 */                 System.loadLibrary(libName);
/* 4 */                 return true;
                    } catch (UnsatisfiedLinkError e) {
/* 19 */                log(IIl001iO0Io.I000oI1ioi("System.loadLibrary(", libName, ") failed: ", e.getMessage()));
/* 22 */                return false;
                    }
                }

                public final void load() {
/* 5 */             if (isLoaded()) {
/* 9 */                 log("Skip loading as the native library is loaded already.");
/* 12 */                return;
                    }
/* 19 */            if (tryLoadLibrary(JNI_LIBNAME)) {
/* 23 */                log("Loaded litertlm_jni from library path.");
/* 26 */                return;
                    }
/* 35 */            String strI000iOII = OlOolloIIOl0.I000iOII(System.mapLibraryName(JNI_LIBNAME), ".dylib", ".so");
/* 41 */            String strConcat = "com/google/ai/edge/litertlm/jni/".concat(strI000iOII);
/* 51 */            if (tryExtractAndLoad(strConcat, strI000iOII)) {
/* 57 */                log("Loaded litertlm_jni from JAR: ".concat(strConcat));
/* 60 */                return;
                    }
/* 73 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("com/google/ai/edge/litertlm/jni/", os(), "-", architecture(), "/");
/* 77 */            sbI00111O.append(strI000iOII);
/* 80 */            String string = sbI00111O.toString();
/* 88 */            if (!tryExtractAndLoad(string, strI000iOII)) {
/* 245 */               throw new UnsatisfiedLinkError(IIl001iO0Io.I000oI1ioi("Failed to load native library litertlm_jni. Tried system path, ", strConcat, ", and ", string));
                    }
/* 94 */            log("Loaded litertlm_jni from JAR: ".concat(string));
                }

                public final native void nativeCheckLoaded();
            }
