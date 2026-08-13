            package p000;

            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.nio.file.FileSystemException;
            import java.nio.file.Files;
            import java.nio.file.LinkOption;
            import java.nio.file.NoSuchFileException;
            import java.nio.file.Path;
            import java.nio.file.Paths;
            import java.nio.file.StandardCopyOption;
            import java.nio.file.attribute.BasicFileAttributes;
            import java.nio.file.attribute.FileTime;
            
            public final class OIIio0iO0 extends O0IO0I {
                public static Long I00Io1lO(FileTime fileTime) {
/* 1 */             long millis = fileTime.toMillis();
/* 5 */             Long lValueOf = Long.valueOf(millis);
/* 13 */            if (millis != 0) {
/* 15 */                return lValueOf;
                    }
/* 16 */            return null;
                }

                @Override
                public final void I0000Il00O(OO0IIO1Il oO0IIO1Il, OO0IIO1Il oO0IIO1Il2) throws IOException {
                    try {
/* 38 */                Files.move(Paths.get(oO0IIO1Il.I00iOIl.I000o00OoI0I(), new String[0]), Paths.get(oO0IIO1Il2.I00iOIl.I000o00OoI0I(), new String[0]), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
                    } catch (UnsupportedOperationException unused) {
/* 46 */                IioIoO10iOiI.I000OOo1O("atomic move not supported");
                    } catch (NoSuchFileException e) {
/* 89 */                throw new FileNotFoundException(e.getMessage());
                    }
                }

                @Override
                public final IlIOoOIo0l I001l0I00(OO0IIO1Il oO0IIO1Il) throws IOException {
                    OO0IIO1Il oO0IIO1IlI0000O;
/* 10 */            Path path = Paths.get(oO0IIO1Il.I00iOIl.I000o00OoI0I(), new String[0]);
                    try {
/* 23 */                BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
/* 38 */                Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
/* 41 */                boolean zIsRegularFile = attributes.isRegularFile();
/* 45 */                boolean zIsDirectory = attributes.isDirectory();
/* 49 */                if (symbolicLink != null) {
/* 51 */                    String str = OO0IIO1Il.I00iiI;
/* 53 */                    String string = symbolicLink.toString();
/* 57 */                    IIOIIi1ilIO iIOIIi1ilIO = I0000oI00.I00000oIO;
/* 61 */                    III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 64 */                    iII1o0lOio0.I00oo1iO0ll(string);
/* 67 */                    oO0IIO1IlI0000O = I0000oI00.I0000O(iII1o0lOio0, false);
                        } else {
/* 73 */                    oO0IIO1IlI0000O = null;
                        }
/* 78 */                Long lValueOf = Long.valueOf(attributes.size());
/* 82 */                FileTime fileTimeCreationTime = attributes.creationTime();
/* 94 */                Long lI00Io1lO = fileTimeCreationTime != null ? I00Io1lO(fileTimeCreationTime) : null;
/* 95 */                FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
/* 107 */               Long lI00Io1lO2 = fileTimeLastModifiedTime != null ? I00Io1lO(fileTimeLastModifiedTime) : null;
/* 108 */               FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
/* 119 */               return new IlIOoOIo0l(zIsRegularFile, zIsDirectory, oO0IIO1IlI0000O, lValueOf, lI00Io1lO, lI00Io1lO2, fileTimeLastAccessTime != null ? I00Io1lO(fileTimeLastAccessTime) : null);
                    } catch (NoSuchFileException | FileSystemException unused) {
/* 14 */                return null;
                    }
                }

                @Override
                public final String toString() {
/* 1 */             return "NioSystemFileSystem";
                }
            }
