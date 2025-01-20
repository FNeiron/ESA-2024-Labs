<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" omit-xml-declaration="yes" indent="yes"/>

    <xsl:template match="/">
        <html>
            <head>
                <meta charset="UTF-8"/>
                <title>Genres</title>
            </head>
            <body>
                <a href="/xsl/genre">Show Genres</a> <a href="/xsl/author">Show Authors</a>
                <h2>Genres</h2>
                <table border="1" style="margin-top: 5px">
                    <tr bgcolor="#CCCCCC">
                        <th>Name</th>
                    </tr>
                    <xsl:for-each select="//GenreDto"> <!-- Iterate directly over GenreDto objects -->
                        <tr>
                            <td><xsl:value-of select="name"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
